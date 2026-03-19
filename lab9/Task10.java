class Library10 {
    class Book {
        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }
}

public class Task10 {
    public static void main(String[] args) {
        Library10 l = new Library10();
        Library10.Book b = l.new Book("Java Basics");
        b.show();
    }
}