
/**
 * Abstract class ReadingMaterial
 * This class describes the basic information of a reading material in the
 * bookstore. It is an abstract method that can be extended to describe a
 * more concrete type of reading material such as a book or a magazine.
 * 
 * @author Kostas Dimitriou & Markos Hatzitaskos
 * @version 1.0
 */
//<<<<<<< HEAD
//public class ReadingMaterial {
//	protected static String bookstoreName;
//
//	// Instance variables
//	private int id;
//	private String title;
//	private int pages;
//	private int price;
//	private int inventory;
//
//	/**
//	 * Constructor
//	 * 
//	 * @param id    the id of the ReadingMaterial
//	 * @param title the title of the ReadingMaterial
//	 * @param pages the number of pages of the ReadingMaterial
//	 * @param price the price of the ReadingMaterial
//	 */
//	ReadingMaterial(int id, String title, int pages, int price) {
//		bookstoreName = "K&M Bookstore";
//
//		this.id = id;
//		this.title = title;
//		this.pages = pages;
//		this.price = price;
//		this.inventory = 0;
//	}
//	ReadingMaterial(int id, String title, int pages, int price, int inventory) {
//		bookstoreName = "K&M Bookstore";
//
//		this.id = id;
//		this.title = title;
//		this.pages = pages;
//		this.price = price;
//		this.inventory = inventory;
//	}
//
//	public int getInventory() {
//		return this.inventory;
//	}
//	
//	public boolean setInventory(int new_inventory) {
//		if (new_inventory >= 0) {
//			this.inventory = new_inventory;
//			return true;
//		} else {
//			return false;
//		}
//	}
//	/**
//	 * Accessor method
//	 * 
//	 * @return the name of the Bookstore
//	 */
//	public String getBookstoreName() {
//		return bookstoreName;
//	}
//
//	/**
//	 * Mutator method
//	 * 
//	 * @param name the name of the Bookstore
//	 */
//	public void setBookstoreName(String bookstoreName) {
//		this.bookstoreName = bookstoreName;
//	}
//
//	/**
//	 * Accessor method
//	 * 
//	 * @return the id of the ReadingMaterial
//	 */
//	public int getId() {
//		return id;
//	}
//
//	/**
//	 * Mutator method
//	 * 
//	 * @param id the id of the ReadingMaterial
//	 */
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	/**
//	 * Accessor method
//	 * 
//	 * @return the title of the ReadingMaterial
//	 */
//	public String getTitle() {
//		return title;
//	}
//
//	/**
//	 * Mutator method
//	 * 
//	 * @param title the title of the ReadingMaterial
//	 */
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	/**
//	 * Accessor method
//	 * 
//	 * @return the number of pages of the ReadingMaterial
//	 */
//	public int getPages() {
//		return pages;
//	}
//
//	/**
//	 * Mutator method
//	 * 
//	 * @param pages the number of pages of the ReadingMaterial
//	 */
//	public void setPages(int pages) {
//		this.pages = pages;
//	}
//
//	/**
//	 * Accessor method
//	 * 
//	 * @return the price of the Reading material
//	 */
//	public int getPrice() {
//		return price;
//	}
//
//	/**
//	 * Mutator method
//	 * 
//	 * @param price the price of the ReadingMaterial
//	 */
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	/**
//	 * Mutator method
//	 * 
//	 * @param increase increase the price of the ReadingMaterial by a number
//	 */
//	public void changePriceBy(int increase) {
//		int newPrice = price + increase;
//
//		if (newPrice >= 0) {
//			this.price = newPrice;
//		}
//	}
//=======
public class ReadingMaterial
{
    protected static String bookstoreName;
    
    // Instance variables
    private int id;
    private String title;
    private int pages;
    private int price;
    private int inventory;
    
    /**
     * Constructor
     * 
     * @param  id    the id of the ReadingMaterial 
     * @param  title    the title of the ReadingMaterial
     * @param  pages    the number of pages of the ReadingMaterial
     * @param  price    the price of the ReadingMaterial
     */
    ReadingMaterial(int id, String title, int pages, int price, int inventory)
    {
        bookstoreName = "K&M Bookstore";
        
        this.id = id;
        this.inventory = inventory;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }
    
    /**
     * Accessor method
     * 
     * @return        the name of the Bookstore 
     */
    public String getBookstoreName()
    { return bookstoreName; }
    
    /**
     * Mutator method
     * 
     * @param  bookstoreName   the name of the Bookstore
     */
    public void setBookstoreName(String bookstoreName)
    { ReadingMaterial.bookstoreName = bookstoreName; }
    
    /**
     * Accessor method
     * 
     * @return        the id of the ReadingMaterial 
     */
    public int getId()
    { return id; }
    
    /**
     * Mutator method
     * 
     * @param  id    the id of the ReadingMaterial 
     */
    public void setId(int id)
    { this.id = id; }
    
    /**
     * Accessor method
     * 
     * @return        the title of the ReadingMaterial 
     */
    public String getTitle()
    { return title; }
    
    /**
     * Mutator method
     * 
     * @param  title    the title of the ReadingMaterial 
     */
    public void setTitle(String title)
    { this.title = title; }
    
    /**
     * Accessor method
     * 
     * @return        the number of pages of the ReadingMaterial 
     */
    public int getPages()
    { return pages; }
    
    /**
     * Mutator method
     * 
     * @param  pages    the number of pages of the ReadingMaterial 
     */
    public void setPages(int pages)
    { this.pages = pages; }
    
    /**
     * Accessor method
     * 
     * @return        the price of the Reading material 
     */
    public int getPrice()
    { return price; }
    
    /**
     * Mutator method
     * 
     * @param  price    the price of the ReadingMaterial 
     */
    public void setPrice(int price)
    { this.price = price; }
    
    /**
     * Mutator method
     * 
     * @param  increase    increase the price of the ReadingMaterial by a number
     */
    public void changePriceBy(int increase)
    { 
        int newPrice = price + increase;

        if(newPrice >= 0) {
                	this.price = newPrice; 
        }
    }

    public int getInventory(){
        return inventory;
    }

    public void setInventory (int inventory){
        this.inventory = inventory;
    }
//>>>>>>> 21419dc912c23081c4a0353141bf391eca8bd009

}
