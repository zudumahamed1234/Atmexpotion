public class librarybook {
    public static void main(String[] args) {
        Book b = new Book("Clean Code");
        try {
            b.borrow();
            b.borrow();
        } catch (BookNotAvailableException e) {
            System.out.println("Sorry: " + e.getMessage());
        } finally {
            System.out.println("Thank you for visiting the library");
        }
    }
}
