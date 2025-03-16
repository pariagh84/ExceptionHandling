public class Book {

    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Page count must be positive");
        }
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return title + "(" + pageCount + ")";
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }
}
