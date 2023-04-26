public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    Author AuthorBookBookThreeMusketeers = new Author("Александр","Дюма");
   Author authorBookThickAngThin = new Author("Антон","Чехов");
   Book threeMusketeers = new Book("Три мушкетера", 1844, AuthorBookBookThreeMusketeers);
   Book thickAngThin = new Book("Толстый и тонкий", 1844 , authorBookThickAngThin);
        System.out.println("threeMusketeers.getAuthorBook().getFirstName() = " + threeMusketeers.getAuthorBook().getFirstName());
        System.out.println("threeMusketeers.getAuthorBook().getLastName() = " + threeMusketeers.getAuthorBook().getLastName());
        System.out.println("threeMusketeers.getNameBook() = " + threeMusketeers.getNameBook());
        System.out.println("threeMusketeers.getPublicationDateBooK() = " + threeMusketeers.getPublicationDateBooK());
        System.out.println("thickAngThin.getAuthorBook().getFirstName() = " + thickAngThin.getAuthorBook().getFirstName());
        System.out.println("thickAngThin.getAuthorBook().getLastName() = " + thickAngThin.getAuthorBook().getLastName());
        System.out.println("thickAngThin.getNameBook() = " + thickAngThin.getNameBook());
        System.out.println("thickAngThin.getPublicationDateBooK() = " + thickAngThin.getPublicationDateBooK());
thickAngThin.setPublicationDateBook1(1883);
    }

}