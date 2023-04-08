abstract class LibraryBooks {
    String title;
    String author;

    LibraryBooks(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean hasTitle(String bookTitle) {

        return this.title.equals(bookTitle);
    }

    public String toString() {

        return "Book Title: " + this.title;
    }
}
