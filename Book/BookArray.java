public class BookArray {

    public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
    		
    		Book bookArray[]= new Book [10];
        
        	bookArray[0]= new Fiction ("Another Fine Myth");
        	bookArray[1]= new Fiction ("Alice in Wonderland");
        	bookArray[2]= new Fiction ("Love Magick");
        	bookArray[3]= new Fiction ("The Notebook");
        	bookArray[4]= new Fiction ("Dean");
            bookArray[5]= new NonFiction ("Bury My Heart at Wounded Knee");
            bookArray[6]= new NonFiction ("In Cold Blood");
            bookArray[7]= new NonFiction  ("Out of Africa");
            bookArray[8]= new NonFiction("Never Cry Wolf");
            bookArray[9]= new NonFiction ("Blink");

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0; i< bookArray.length; i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].getBookTitle() + " " + bookArray[i].getBookPrice() + "\n" );
        }
    }
}
