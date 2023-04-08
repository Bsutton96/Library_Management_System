import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @org.junit.jupiter.api.Test
    void testNewLibrary() {
        Library testLibrary = new Library();
    }

    @org.junit.jupiter.api.Test
    void testNewMember() {
        LibraryMember ben = new LibraryMember("Ben");
    }

    @org.junit.jupiter.api.Test
    void testAddBook() {
        Library testLibrary = new Library();
        testLibrary.addItem(new Book("Wool", "Hugh Howey"));

    }

    @org.junit.jupiter.api.Test
    void testCheckOut() {
        Library testLibrary = new Library();
        LibraryMember ben = new LibraryMember("Ben");
        testLibrary.addItem(new Book("Wool", "Hugh Howey"));

        ben.borrowItem((Borrow) testLibrary.findTitle("Wool"));

    }

    @org.junit.jupiter.api.Test
    void testCheckIn() {
        Library testLibrary = new Library();
        LibraryMember ben = new LibraryMember("Ben");
        testLibrary.addItem(new Book("Seveneves", "Neal Stephenson"));

        ben.borrowItem((Borrow) testLibrary.findTitle("Seveneves"));

        ben.returnItem((Borrow) testLibrary.findTitle("Seveneves"), 0);
    }

    @org.junit.jupiter.api.Test
    void testCheckInOverdue() {
        Library testLibrary = new Library();
        LibraryMember ben = new LibraryMember("Ben");
        testLibrary.addItem(new Book("Seveneves", "Neal Stephenson"));

        ben.borrowItem((Borrow) testLibrary.findTitle("Seveneves"));

        ben.returnItem((Borrow) testLibrary.findTitle("Seveneves"), 3);
    }

    @org.junit.jupiter.api.Test
    void testCheckInMemberSuspend() {
        Library testLibrary = new Library();
        LibraryMember ben = new LibraryMember("Ben");
        testLibrary.addItem(new Book("Seveneves", "Neal Stephenson"));

        ben.borrowItem((Borrow) testLibrary.findTitle("Seveneves"));

        ben.returnItem((Borrow) testLibrary.findTitle("Seveneves"), 44);
    }


}