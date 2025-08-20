package ExtraAssignment.LibrarySystem;
import java.util.ArrayList;
import java.util.List;
public class Library {
	private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("- " + magazine.getTitle() + " Issue " + magazine.getIssueNumber());
            }
        }
    }

}
