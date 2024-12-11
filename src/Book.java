public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Вы одолжили книгу: <<" + title + ">>!\n");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга <<" + title +">>на месте!\n");
    }

    public void displayInfo() {
        System.out.println(
                "Книга: " + title + ":" + "\nавтор: " + author +
                "\nгод: " + year + "\nстатус: " + isAvailable + "\n"
        );
    }
}