public class Main {
    public static void main(String[] args) {
        Book book3 = new Book("Философия JAVA", "Брюс Эккель", 2024, false);
        Library library = new Library();

        System.out.println("==Доступные книги:== ");
        library.printAvailableBooks();

        library.addBook(book3);

        System.out.println("==Доступные книги:== ");
        library.printAvailableBooks();

        book3.returnBook();
        System.out.println("==Доступные книги:== ");
        library.printAvailableBooks();

        book3.borrowBook();
        System.out.println("==Доступные книги:== ");
        library.printAvailableBooks();

        Book book4 = new Book("Философия JAVA", "Брюс Эккель", 2024);
        library.addBook(book4);

        System.out.println("==Доступные книги:== ");
        library.printAvailableBooks();
    }
}