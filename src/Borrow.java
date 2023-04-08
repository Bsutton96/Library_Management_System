interface Borrow {
    public double lateFee(int daysOverdue);
    public LibraryBooks checkOut();
    public LibraryBooks checkIn();
}
