package pl.javastart.filmueb.model.userRelated;

public enum Role {

    USER ("Uzytkownik"),
    ADMIN ("Administrator"),
    MODERATOR ("Moderator");

    private String description;

    Role(String description) {
        this.description = description;
    }
}
