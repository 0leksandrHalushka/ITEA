package lesson8;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Fight club", "Chuck Palahniuk", "W. W. Norton", 12);

        System.out.println(book.toString() + "\n");
        book.setPrice(7);
        System.out.println(book.toString() + "\n");
        book.setPublisher("Norton");
        book.setPrice(15);
        System.out.println(book.toString() + "\n");
    }
}
