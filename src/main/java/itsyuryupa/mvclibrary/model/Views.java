package itsyuryupa.mvclibrary.model;

public class Views {
    // Вьюха для базовой информации о книге (ID, название и автор)
    public static class BookSummary {}

    // Вьюха для полной информации о книге, включая детали автора
    public static class BookDetail extends BookSummary {}
}

