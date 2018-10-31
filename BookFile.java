import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * class BookFile
 * This class is responsible for reading the file where all the books are stored.
 * Furthermore, this class can also write a book entry to the file.
 * 
 * @author Kostas Dimitriou & Markos Hatzitaskos
 * @version v1.0
 */
public class BookFile
{
    static final String FILENAME = "bookFile";   

    /**\\\\44er64
     * readBookFile - reads all the book entries from the bookstore
     * 
     * @return     DynamicQueue with all the contents of the bookFile (i.e. all the books in our bookstore) 
     */
    public Book[] readBookFile()
    {
        Book[] arrayOfBooks = new Book[999];
        int length = 0;
        
        try {
            FileReader theBookFile = new FileReader(FILENAME);
            BufferedReader input = new BufferedReader(theBookFile);

            String line;

            while((line = input.readLine()) != null) {
                length = length + 1;

                int token = line.indexOf(":");
                int nextToken = line.indexOf(":", token+1);

                int id = Integer.parseInt(line.substring(0, token));        
                String title = line.substring(token+1, nextToken);

                token = nextToken;
                nextToken = line.indexOf(":", token+1);

                int pages = Integer.parseInt(line.substring(token+1, nextToken));

                token = nextToken;
                nextToken = line.indexOf(":", token+1);

                int price = Integer.parseInt(line.substring(token+1, nextToken));

                token = nextToken;
                nextToken = line.indexOf(":", token+1);


                int chapters = Integer.parseInt(line.substring(token+1, nextToken));

                token = nextToken;
                nextToken = line.indexOf(":", token+1);
              
                String author = line.substring(token+1, nextToken);

                token = nextToken;
                nextToken = line.indexOf(":", token+1);

                int inventory = Integer.parseInt(line.substring(token+1, nextToken));

                token = nextToken;
                nextToken = line.indexOf(":", token+1);
                    
                Book entry = new Book(id, title, pages, price, chapters, author, inventory);
                
                arrayOfBooks[length-1] = entry;
            }  
            input.close();
        } catch (Exception e) {
            //bookFile does not exist or can not be created.
            String err = e.toString();
            InputOutput.output("");
            InputOutput.output("The file does not exist or cannot be created.");
            InputOutput.output(err);
        }
        
        Book[] properArrayOfBooks = new Book[length];
        
        
        
        for(int i=0; i<length; i++) {
            properArrayOfBooks[i] = arrayOfBooks[i];
        }
        
        return properArrayOfBooks;
    }
    
    
    /**
     * writeToBookFile - writes a new book entry to the book file.
     * 
     * @param  b   a new book entry
     */
    public void writeToBookFile(Book b) 
    {
        Book[] books = readBookFile();
        Book[] booksWithAddedBook;

        if(books != null) {

            booksWithAddedBook = new Book[books.length+1];

            for(int i=0; i < books.length; i++) {
                booksWithAddedBook[i] = books[i];
            }

            booksWithAddedBook[booksWithAddedBook.length-1] = b;
        } else {
            booksWithAddedBook = new Book[1];
            booksWithAddedBook[0] = b;
        }

        writeBooksToBookFile(booksWithAddedBook);
    }

    /**
     * writeBooksToBookFile - writes an array of books to the book file.
     * 
     * @param  books   an array of books
     */
    public void writeBooksToBookFile(Book[] books) 
    {
        PrintWriter output = null;
        
        
            try {
                output = new PrintWriter(FILENAME); 
            } catch (Exception e) {
                //bookFile does not exist or can not be created.
                String err = e.toString();
                InputOutput.output("");
                InputOutput.output("The file cannot be created.");
                InputOutput.output(err);
            }
            
        if(books != null && books.length != 0) {
            for(int i=0; i < books.length; i++) {

                Book temp = books[i];

                int id = temp.getId();
                String title = temp.getTitle();
                int pages = temp.getPages();
                int price = temp.getPrice();
                int chapters = temp.getChapters();
                String author = temp.getAuthor();
                int inventory = temp.getInventory();

                
                //append them to the bookFile file.
                output.print(id + ":");
                output.print(title + ":");
                output.print(pages + ":");
                output.print(price + ":");
                output.print(chapters + ":");
                output.print(author + ":");
                output.print(inventory + ":");
            }
            
        } else {
            output.print("");
        }
        
        output.close();
    }

    /**
     * outputAllBooksToTerminal - outputs all the books in the bookstore to the terminal without sorting
     * 
     */
    public void outputAllBooksToTerminal() 
    {
        Book[] books = null;

        books = readBookFile();

        if(books != null) {
            
            if(books.length == 0) {
                InputOutput.output("");
                InputOutput.output("The bookstore is empty.");
                InputOutput.output("");
            }
            
            for(int i=0; i < books.length; i++) {

                Book temp = books[i];

                int id = temp.getId();
                String title = temp.getTitle();
                int pages = temp.getPages();
                int price = temp.getPrice();
                int chapters = temp.getChapters();
                String author = temp.getAuthor();
                int inventory = temp.getInventory();

                InputOutput.output("");
                InputOutput.output("=================================");
                InputOutput.output("ID:" + id);
                InputOutput.output("TITLE:" + title);
                InputOutput.output("PAGES:" + pages);
                InputOutput.output("PRICE ($):" + price);
                InputOutput.output("CHAPTERS:" + chapters);
                InputOutput.output("AUTHOR(S):" + author);
                InputOutput.output("INVENTORY:" + inventory);
       

                InputOutput.output("=================================");
                InputOutput.output("");
            }
            
        } else {
            InputOutput.output("");
            InputOutput.output("There are no books in the bookstore.");
            InputOutput.output("");
        }
    }
}
