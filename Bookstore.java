/**
 * Bookstore class is the main class for the Bookstore example. 
 * 
 * @author Kostas Dimitriou & Markos Hatzitaskos 
 * @version 1.0
 */
public class Bookstore
{
    // instance variables
    BookFile bf;
    
    /**
     * Main method
     */
    public static void main(String[] args)
    {
        new Bookstore();
    }
    
    /**
     * Constructor for objects of class Bookstore
     */
    public Bookstore() 
    {      
        //sequentially
        bf = new BookFile();
 
        showMenu();
    }

    /**
     * showMenu method - displays the start menu in the Terminal.
     * 
     */
    public void showMenu()
    {
        InputOutput.output("========================");
        InputOutput.output("Welcome to the Bookstore");
        InputOutput.output("========================");
        InputOutput.output("");
        InputOutput.output("Select one of the following actions:");
        InputOutput.output("a) List all the books in the bookstore");
        InputOutput.output("b) Add a book to the bookstore");
        InputOutput.output("c) Sort books by price (descending)");
        InputOutput.output("d) Sort books by price (ascending)");
        InputOutput.output("e) Find book with title");
        InputOutput.output("f) Exit");
        InputOutput.output("");
        InputOutput.output("");

        char selection = InputOutput.inputChar("Which action do you want to perform? ");
        
        switch (selection) {
            case 'a' : listAllBooks();
            break; 
            case 'b' : addBook();   
            break;
            case 'c' : sortByPrice(false);
            break;
            case 'd' : sortByPrice(true);
            break;
            case 'e' : findBookTitle();
            break;
            case 'f' : System.exit(0);
            break;
            default : showMenu();
            break;
        }
    }

    /**
     * listAllBooks method - lists all the books of the bookstore in the terminal. 
     */
    public void listAllBooks()
    {
            //sequentially
            bf.outputAllBooksToTerminal();
            InputOutput.output("");
            InputOutput.input("Press ANY BUTTON to continue.");
            InputOutput.output("");
            showMenu();
    }

    /**
     * addBook method - allows the user to add a book through the terminal
     */
    public void addBook()
    {
        InputTerminal addBook = new InputTerminal();
        Book b = addBook.bookEntry();

        bf.writeToBookFile(b);

        InputOutput.output("");
        InputOutput.input("Press ANY BUTTON to continue.");
        InputOutput.output("");
        showMenu();
    }

    /**
     * sortByPrice method
     * 
     * @param ascending     whether the Bookstore list is sorted in an ascending or descending way. 
     */
    public void sortByPrice(boolean ascending)
    {

        Book[] books = null;

        //sequentially
        books = bf.readBookFile();

        if(books == null || books.length == 0) 
            InputOutput.output("There are no books in the bookstore to sort.");
        else {
            if(ascending) {
                books = BubbleSort.bubbleSortA(books, true);
                InputOutput.output("");
                InputOutput.output("Sorted books by price (ascending):");
                InputOutput.output("");
            } else {
                books = BubbleSort.bubbleSortA(books, false);
                InputOutput.output("");
                InputOutput.output("Sorted books by price (descending):");
                InputOutput.output("");
            }

            for(int i=books.length-1; i>=0; i--) {
                int id = books[i].getId();
                String title = books[i].getTitle();
                int pages = books[i].getPages();
                int price = books[i].getPrice();
                int chapters = books[i].getChapters();
                String author = books[i].getAuthor();
                
                InputOutput.output("");
                InputOutput.output("=================================");
                InputOutput.output("ID:" + id);
                InputOutput.output("TITLE:" + title);
                InputOutput.output("PAGES:" + pages);
                InputOutput.output("PRICE ($):" + price);
                InputOutput.output("CHAPTERS:" + chapters);
                InputOutput.output("AUTHOR(S):" + author);       

                InputOutput.output("=================================");
                InputOutput.output("");
            }
        }

        InputOutput.output("");
        InputOutput.input("Press ANY BUTTON to continue.");
        InputOutput.output("");
        showMenu();
    }

    /**
     * findBookTitle method
     * 
     * @return     find a Book with a given book title.
     */
    public void findBookTitle()
    {
        InputOutput.output("");
        InputOutput.output("Search for a book.");
        String searchParameter = InputOutput.input("Title to search: ");
        InputOutput.output("");

        Book[] books = null;

        //sequentially
        books = bf.readBookFile();

        int toShow = SequentialSearch.sequentialSearchTitle(searchParameter, books);

        do {

            if(toShow == -1) 
                InputOutput.output("There is no book in the bookstore with such a title.");
            else {
                int id = books[toShow].getId();
                String title = books[toShow].getTitle();
                int pages = books[toShow].getPages();
                int price = books[toShow].getPrice();
                int chapters = books[toShow].getChapters();
                String author = books[toShow].getAuthor();
                
                InputOutput.output("");
                InputOutput.output("=================================");
                InputOutput.output("ID:" + id);
                InputOutput.output("TITLE:" + title);
                InputOutput.output("PAGES:" + pages);
                InputOutput.output("PRICE ($):" + price);
                InputOutput.output("CHAPTERS:" + chapters);
                InputOutput.output("AUTHOR(S):" + author);
                InputOutput.output("=================================");
                InputOutput.output("");

                int ltemp = books.length - toShow - 1;
                Book[] temp = new Book[ltemp];

                for(int i=0; i<temp.length; i++)
                    temp[i] = books[toShow+i+1];

                books = temp;

                toShow = SequentialSearch.sequentialSearchTitle(searchParameter, books);

            }
        } while(toShow != -1);

        InputOutput.output("");
        InputOutput.input("Press ANY BUTTON to continue.");
        InputOutput.output("");
        showMenu();
    }
}
