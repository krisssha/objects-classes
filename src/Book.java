public class Book {
    private String authorsName;
    private Autor autor;
    private int publicationYear;

    public Book(String authorsName, Autor autor, int publicationYear) {
        this.authorsName = authorsName;
        this.autor = autor;
        this.publicationYear = publicationYear;
    }

    public String getAuthorsName() {
        return this.authorsName;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
}

}
