package app;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import app.Book;
import app.BookDB;
import app.Library;
public class BookTest {

	@Test
	public void test() {
		//hi it is userb
		BookDB db = Mockito.mock(BookDB.class);
		Library lib =  new Library(db);
		List <Book> = fictionBook = new ArrayList<>();
		Book book1 = new Book("abc","Fiction");
		Book book2 = new Book("xyz","Fiction");
		fictionBook.add(book1);
		fictionBook.add(book2);
		
	}
}
