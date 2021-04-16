import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Book> catalog = new ArrayList<>();

    public void setCatalog(List<Book> catalog) {
        this.catalog = catalog;
    }

    public List<Book> getCatalog() {
        return catalog;
    }

    public void addBook (Book book){
        catalog.add(book);
    }

    public void removeBook (Book book) {
        catalog.remove(book);
    }

    @Override
    public String toString() {
        return " " + catalog;
    }
}
