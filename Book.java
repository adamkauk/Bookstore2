
/**
 * class Book
 * This class describes the basic information of a book in the
 * bookstore. It extends the ReadingMaterial class.
 * 
 * @author Kostas Dimitriou & Markos Hatzitaskos
 * @version 1.0
 */
public class Book extends ReadingMaterial
{
    // instance variables
    private int chapters;
    private String author;
    
   /**
     * Constructor
     * 
     * @param  id    the id of the book 
     * @param  title    the title of the book
     * @param  pages    the number of pages of the book
     * @param  price    the price of the book
     * @param  chapters the number of chapters in the book
     * @param  author  author of the book
     */
    public Book(int id, String title, int pages, int price, int chapters, String author, int inventory)
    {
        //Calls the ReadingMaterial constructor.
        super(id, title, pages, price, inventory);
        
        this.chapters = chapters;
        this.author = author;
    }

    /**
     * Accessor method
     * 
     * @return        the number of chapters in the Book
     */
    public int getChapters()
    { return chapters; }
    
    /**
     * Mutator method
     * 
     * @param  chapters    the number of chapters in the Book 
     */
    public void setChapters(int chapters)
    { this.chapters = chapters; }
    
    /**
     * Accessor method
     * 
     * @return        list of the author of the book
     */
    public String getAuthor()
    { return author; }
    
    /**
     * Mutator method
     * 
     * @param  author 0987     list of the author of the book
     */
    public void setAuthor(String author)
    { this.author = author; }
}
