package LibraryManagement;

public class Book {

    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Page count must be positive");
        }
        this.pageCount = pageCount;
        this.title = title;
    }

    @Override
    public String toString() {
        if (pageCount == 1) {
            return title + "(" + pageCount + " page)";
        }
        return title + "(" + pageCount + " pages)";
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }
}
