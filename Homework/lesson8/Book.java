package lesson8;

/*

1. Напишіть клас для реалізації класу інформації про книгу.

Завдання:

Поля: назва, автор, видавець, ціна.
Методи: виведення інформації


Вимога:

Розробіть конструктор для присвоєння властивостей
Встановіть private властивість до полів та методи get/set для доступу до них
Ціна має бути більшою за 10. Якщо вона недійсна, вам потрібно підказати і примусово встановити значення 10.
І автор, і назва доступні лише для читання.
Метод виведення інформації описує всю інформацію у книзі.

 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 10) {
            System.out.println("Price must be more than 10! Automatically set minimum price = 10.");
            this.price = 10;
        } else {
            this.price = price;
        }

    }

    @Override
    public String toString(){

        return "Author: " + author + "\nBook title: " + title + "\nPrice: " + price + "\nPublisher: " + publisher;
    }


}
