package itsyuryupa.mvclibrary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @JsonView(Views.BookSummary.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonView(Views.BookSummary.class)
    private String title;

    @JsonView(Views.BookSummary.class)
    private String genre;

    @JsonView(Views.BookSummary.class)
    private int published_year;

    @JsonView(Views.BookDetail.class)
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    @JsonBackReference
    private Author author;
}
