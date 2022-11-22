import java.util.Objects;

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


    public String toString() {
        return "Год издания : " + this.publicationYear + " ; " + autor.toString();
    }

    public boolean equals(Object obj) {

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return Objects.equals(authorsName, book.authorsName) &&
                autor.equals(book.autor) &&
                publicationYear == book.publicationYear;
    }

    public int hashCode() {
        return Objects.hashCode(authorsName) + Objects.hashCode(autor) + Objects.hashCode(publicationYear) * 31;
    }
}