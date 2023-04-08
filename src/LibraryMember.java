import java.util.LinkedList;
class LibraryMember {
    String name;
    double feesOwed = 0;
    LinkedList<Borrow> checkedOut = new LinkedList<Borrow>();

    LibraryMember(String name) {
        this.name = name;
    }

    LibraryMember returnItem(Borrow item, int daysOver) {
        if (daysOver < 30) {
            this.feesOwed = this.feesOwed + item.lateFee(daysOver);
            System.out.println("Items Checked In: " + this.checkedOut + "\nOverdue Charges: $" + this.feesOwed);
            this.checkedOut.remove(item);
            item.checkIn();
            return this;
        } else {
            this.feesOwed = this.feesOwed + item.lateFee(daysOver) + 30;
            System.out.println("Items Checked In: " + this.checkedOut + "\nMembership Suspended. Please pay overdue fees plus cost of book to reactivate membership. Total Cost: " + "$" + this.feesOwed);
            this.checkedOut.remove(item);
            item.checkIn();
            return this;
        }
    }

    LibraryMember borrowItem(Borrow item) {
        item.checkOut();
        this.checkedOut.add(item);
        System.out.println("Items Checked Out: " + this.checkedOut);
        return this;
    }

}
