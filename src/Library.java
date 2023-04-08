import java.util.LinkedList;

class Library {
    LinkedList<LibraryBooks> bookList = new LinkedList<LibraryBooks>();

    Library() {}

    Library addItem(LibraryBooks newItem) {
        bookList.add(newItem);
        return this;
    }

    LibraryBooks findTitle(String bookTitle) {
        for (LibraryBooks item : bookList) {
            if (item.hasTitle(bookTitle)) {
                return item;
            }
        }
        return null;
    }
}
