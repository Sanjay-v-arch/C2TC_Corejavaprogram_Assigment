package ExtraAssignment.LibrarySystem;

public class Item {
	private int id;
    private String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title);
    }

    // Getters for composition use later
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
