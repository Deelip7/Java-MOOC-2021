public class Book {
    private String title;
    private int pages;
    private String publicationYear;

    public Book(String title, int pages, String publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
