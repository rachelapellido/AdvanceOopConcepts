
public class UsedBooks {
		public static void main (String [] args)
		{
		
			Book book;
			System.out.print("Fiction Book: ");
			book = new Fiction ("Dean");
			System.out.println(book.getBookTitle() + " for $" + book.getBookPrice());
			
			System.out.print("Non Fiction Book: ");
			book = new NonFiction ("In Cold Blood");
			System.out.println(book.getBookTitle() + " for $" + book.getBookPrice());
		}
	}
