package pl.javastart.filmueb.model.movieRelated;

import java.lang.String;

public enum Category {
    COMEDY("Komedia"),
    DRAMA("Dramat"),
    THRILLER("Thriller"),
    HORROR("Horror"),
    SCENICE_FICTION("Sajensfikszyn");

    private String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
