import java.util.LinkedList;
public class Library {

		LinkedList<Book> holdings = new LinkedList<Book>();
		
		Library(){
			
		}
		
		public Library addBook(Book aBook) {
			this.holdings.add(aBook);
			return this;
		}
		
		//produces a list of all books  that are currently checked out
		public LinkedList<Book> checkedOut(){
			LinkedList<Book> checkedOutBooks = new LinkedList<Book>();
			
			for(Book aBook : this.holdings) {
				if(aBook.isAvailable == false) {
					checkedOutBooks.add(aBook);
				}
			}
			return checkedOutBooks;
		}
		
		Book findByTitle(String aTitle) {
			for(Book item: holdings) {
				if(item.title.equals(aTitle)) {
					return item;
				}
			}
			//If the method cannot find a book with the same title, something must still be returned
			return null;
		}
}

