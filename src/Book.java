class Book extends AvailableBooks {

    Book(String title, String author) {

        super(title, author);
    }

    public double lateFee(int daysOverdue) {

        return daysOverdue * .50;
    }
}
