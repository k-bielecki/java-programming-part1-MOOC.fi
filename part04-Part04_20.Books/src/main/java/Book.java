public class Book {

    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book (String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return title + ", " + numberOfPages + " pages, " + publicationYear;
    }

}
