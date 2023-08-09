package app;

import java.util.List;

public class Library {
	
	BookDB db;

	List <Book> books;
	public Library(BookDB db){
		this.db = db;
	}
	public List<Book> getBooksByCategory(String category){
		if(category.equals("Fiction")) {
			return db.getFictionBooks();
		}
		else
			return null;
	}
}
