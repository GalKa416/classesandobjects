public class Main {
    public static void main(String[] args) {
        System.out.println("Hello  world!");
    Author authorBookBookThreeMusketeers = new Author("Александр","Дюма");
   Author authorBookThickAngThin = new Author("Антон","Чехов");
   Book threeMusketeers = new Book("Три мушкетера", 1844, authorBookBookThreeMusketeers);
   Book thickAngThin = new Book("Толстый и тонкий", 1883 , authorBookThickAngThin);

        System.out.println("threeMusketeers.getAuthorBook().getFirstName() = " + threeMusketeers.getAuthorBook().getFirstName());
        System.out.println("threeMusketeers.getAuthorBook().getLastName() = " + threeMusketeers.getAuthorBook().getLastName());
        System.out.println("threeMusketeers.getNameBook() = " + threeMusketeers.getNameBook());
        System.out.println("threeMusketeers.getPublicationDateBooK() = " + threeMusketeers.getPublicationDateBooK());
        System.out.println("thickAngThin.getAuthorBook().getFirstName() = " + thickAngThin.getAuthorBook().getFirstName());
        System.out.println("thickAngThin.getAuthorBook().getLastName() = " + thickAngThin.getAuthorBook().getLastName());
        System.out.println("thickAngThin.getNameBook() = " + thickAngThin.getNameBook());
        System.out.println("thickAngThin.getPublicationDateBooK() = " + thickAngThin.getPublicationDateBooK());
        thickAngThin.setPublicationDateBook(1883);
        System.out.println("thickAngThin.getPublicationDateBooK() = " + thickAngThin.getPublicationDateBooK());

        System.out.println(thickAngThin);
        System.out.println(threeMusketeers);
        System.out.println("authorBookBookThreeMusketeers.equals(authorBookThickAngThin) = " + authorBookBookThreeMusketeers.equals(authorBookThickAngThin));
   Author authorBookIonych = new Author("Антон" , "Чехов");
        System.out.println("authorBookThickAngThin.equals(authorBookIonych) = " + authorBookThickAngThin.equals(authorBookIonych));
        System.out.println("authorBookThickAngThin.hashCode() = " + authorBookThickAngThin.hashCode());
        System.out.println("authorBookThickAngThin.hashCode() = " + authorBookThickAngThin.hashCode());
        System.out.println("threeMusketeers.hashCode() = " + threeMusketeers.hashCode());
        System.out.println("thickAngThin.hashCode() = " + thickAngThin.hashCode());
    }


}