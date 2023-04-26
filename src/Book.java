public class Book {
    private Author authorBook;
    private String nameBook;
    private int publicationDateBook;

    public Book( String nameBook, int publicationDateBook, Author authorBook) {
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.publicationDateBook = publicationDateBook;

    }
    public Author getAuthorBook (){
        return this.authorBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getPublicationDateBooK() {
        return this.publicationDateBook;
    }
    public void setPublicationDateBook1 (int publicationDateBook) {
    this.publicationDateBook = publicationDateBook;
    }
}

