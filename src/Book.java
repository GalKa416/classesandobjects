import java.util.Objects;

public class Book {
    private Author authorBook;
    private String nameBook;
    private int publicationDateBook;

    public Book(String nameBook, int publicationDateBook, Author authorBook) {
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.publicationDateBook = publicationDateBook;

    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublicationDateBooK() {
        return this.publicationDateBook;
    }

    public void setPublicationDateBook(int publicationDateBook1) {

        this.publicationDateBook= publicationDateBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDateBook == book.publicationDateBook && Objects.equals(authorBook, book.authorBook) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorBook, nameBook, publicationDateBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorBook=" + authorBook +
                ", nameBook='" + nameBook + '\'' +
                ", publicationDateBook=" + publicationDateBook +
                '}';
    }
}


