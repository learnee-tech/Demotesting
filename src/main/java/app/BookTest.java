package app;
import app.Book;
import app.BookDB;
import app.Library;
public class BookTest {

	@Test
	public void test() {
		BookDB db = Mockito.mock(BookDB.class);
		Library lib =  new Library(db);
		List <Book> = fictionBook = new ArrayList<>();
		Book book1 = new Book("abc","Fiction");
		Book book2 = new Book("xyz","Fiction");
		fictionBook.add(book1);
		fictionBook.add(book2);
		
	}
}
