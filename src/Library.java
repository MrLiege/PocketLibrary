import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> bookList;

    static {
        bookList = new ArrayList<>();
        bookList.add(new Book("1984", "Джордж Оруэлл", 1948 ));
        bookList.add(new Book("Портрет Дориана Грея", "Оскар Уайльд", 1890, true));
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void printAvailableBooks() {
        System.out.println("Список доступгых книг в библиотеке:");

        for (Book book : bookList) {
            if (book.getIsAvailable()) {
                book.displayInfo();
            }
        }
    }
    public List<Book> findBooksByAuthor(String author) {
        List<Book> authorsBook = new ArrayList<>();
        System.out.println("Результат: \n");
        for (Book book : bookList) {
                if (book.getAuthor() == author) {
                    authorsBook.add(book);
            }
        }
        if (authorsBook.isEmpty()) {
            System.out.println("Книги не найдены!\n");
        } else {
            for(int i = 0; i <= authorsBook.size(); i++) {
                System.out.println(i + ". " + authorsBook.get(i) + "\n");
            }
        }
        return authorsBook;
    }
}

