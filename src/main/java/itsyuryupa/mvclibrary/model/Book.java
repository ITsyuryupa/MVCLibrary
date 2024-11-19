package itsyuryupa.mvclibrary.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String genre;

    private int year;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
