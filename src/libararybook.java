class BookNotAvailableException extends Exception {
    BookNotAvailableException(String title) {
        super("'" + title + "' is already borrowed");
    }
}

class Book {
    private String title;
    private boolean borrowed;

    Book(String title) { this.title = title; }

    void borrow() throws BookNotAvailableException {
        if (borrowed) throw new BookNotAvailableException(title);
        borrowed = true;
        System.out.println("You borrowed '" + title + "'");
    }
}

