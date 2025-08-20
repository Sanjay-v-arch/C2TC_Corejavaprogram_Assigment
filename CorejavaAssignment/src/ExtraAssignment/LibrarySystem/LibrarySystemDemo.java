package ExtraAssignment.LibrarySystem;

public class LibrarySystemDemo {

	public static void main(String[] args) {
		// Part A: Inheritance demo
        Book b1 = new Book(101, "Java", "san Gosling");
        Magazine m1 = new Magazine(201, "Tech ", 45);

        b1.displayInfo(); 
        m1.displayInfo(); 

        // Part B: Composition demo
        Library library = new Library();
        library.addItem(b1);
        library.addItem(m1);

        library.showAllItems();
    }

	}


