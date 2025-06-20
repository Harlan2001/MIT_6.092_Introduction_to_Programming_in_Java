public class Library {
    // Add the missing implementation to this class
    String address;
    Book[] books = new Book[10];
    int bookcount = 0;

    public Library(String libaddress) {
        address = libaddress;
    }

    public void addBook(Book book) {
        books[bookcount] = book;
        bookcount++;
    }

    public static void printOpeningHours() {
        System.out.println(" 9am - 5pm.");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookname) {
        for (int index = 0; index < bookcount; index++) {
            if (books[index].title.equals(bookname)) {
                books[index].rented();
            }
        }
    }

    public void printAvailableBooks() {
        for (int index = 0; index < bookcount; index++) {
            if (books[index].isBorrowed() == false) {
                System.out.println(books[index].title);
            }
        }
    }

    public void returnBook(String bookname){
        for(int index = 0; index < bookcount; index++){
            if(books[index].title.equals(bookname)){
                books[index].returned();
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}