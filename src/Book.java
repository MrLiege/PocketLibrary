public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean isAvailable;

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
        this.isAvailable = true;
    }

    public String isTitle() {
        return title;
    }

    public String isAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Вы одолжили книгу: <<" + title + ">>!\n");
        } else {
            System.out.println("Книга <<" + title + ">> уже занята!\n");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Книга <<" + title + ">>на месте!\n");
        } else {
            System.out.println("Книга <<" + title + ">> уже занята!\n");
        }
    }

    public void displayInfo() {
        System.out.println(
                "Книга: " + title + ":" + "\nавтор: " + author +
                "\nгод: " + year + "\nстатус: " + isAvailable + "\n"
        );
    }
}