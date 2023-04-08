abstract class AvailableBooks extends LibraryBooks implements Borrow {
    boolean isAvailable = true;

    AvailableBooks(String title, String author) {

        super(title, author);
    }

    public LibraryBooks checkOut() {
        this.isAvailable = false;

        return this;
    }

    public LibraryBooks checkIn() {
        this.isAvailable = true;
        return this;
    }
}
