package bookstore;


/**
 * SequentialSearch holds the methods needed for sequential search for this program.
 * 
 * @author Kostas Dimitriou & Markos Hatzitaskos
 * @version 1.0
 */
public class SequentialSearch
{
    /**
     * sequentialSearchTitle - searches an array of Book records for a specific title.
     * 
     * @param  target   the title to be found
     * @param  nums     the array of Book records to be searched
     * @return     -1 if element not found, else the index where our element resides in the Book[] array. 
     */
    public static int sequentialSearchTitle(String target, Book[] nums)
    {
        int size = nums.length;
        boolean found = false;
        int place = 0;
        while (place < size && !found)
        {
            String toFind = nums[place].getTitle();
            String toFindTrim = toFind.trim();
            if (target.equals(toFindTrim))
            { found = true; }
            else
            { place = place + 1; }
        }
        if (found)
        { return place; }
        else
        { return -1; }
    }
    
    /**
     * sequentialSearchAuthor - searches an array of Book records for a specific author.
     * 
     * @param  target   the author to be found
     * @param  nums     the array of Book records to be searched
     * @return     -1 if element not found, else the index where our element resides in the Book[] array. 
     */
    public static int sequentialSearchAuthor(String target, Book[] nums)
    {
        int size = nums.length;
        boolean found = false;
        int place = 0;
        while (place < size && !found)
        {
            String toFind = nums[place].getAuthor();
            
            String toFindTrim = toFind.trim();
            
            if (target.equals(toFindTrim))
            { found = true; }
            else
            { place = place + 1; }
        }
        if (found)
        { return place; }
        else
        { return -1; }
    }
}
