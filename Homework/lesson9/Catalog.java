package lesson9;

public class Catalog {

    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private BookStory bookStory;

    private class BookStory{

        private String bookStatus;
        private String reader;

        public void setReader(String reader) {
            this.reader = reader;
        }

        private String bookInfo(){
            if (reader != null) {
                bookStatus = "Book status: the book is in the reader's possession";
                return "Reader: " + reader + bookStatus;
            } else {
                reader = "No reader";
                bookStatus ="The book is in the library";
                return  reader + bookStatus;
            }
        }

    }

    public void createBookInfo(String reader){
        bookStory = new BookStory();
        bookStory.setReader(reader);
        bookStory.bookInfo();

    }

    @Override
    public String toString() {
        return "Catalog{" +
                "bookName = '" + bookName + '\'' +
                ", book Story = " + bookStory.bookStatus +
                ", reader = " + bookStory.reader +
                '}';
    }
}
