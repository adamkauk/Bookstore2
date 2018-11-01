
/**
 * BubbleSort class contains methods to sort various data structures in specific orders using the
 * bubble sort algorithm.
 * 
 * @author Kostas Dimitriou & Markos Hatzitaskos
 * @version 1.0
 */
public class BubbleSort
{
    /**
     * bubbleSortA - sorts the books in the bookstore by price.
     * 
     * @param books   an array containing the books to be sorted 
     */
    public static Book[] bubbleSortA(Book[] books, boolean ascending)
    {
        int size = books.length;
        int last, current;
        Book temp;
        for(last = size-1; last > 0; last = last - 1)
        { for(current = 0; current < last; current = current + 1)
            { 
                if(ascending) {
                    if (books[current].getPrice() > books[current + 1].getPrice())
                    {
                        temp = books[current];
                        books[current] = books[current+1];
                        books[current+1] = temp;
                    }
                } else {
                    if (books[current].getPrice() < books[current + 1].getPrice())
                    {
                        temp = books[current];
                        books[current] = books[current+1];
                        books[current+1] = temp;
                    }
                }
            }
        }
        
        return books;
    }

    public static Book[] bubbleSortB(Book[] books) {
        int size = books.length;
        int last, current;
        Book temp;
        for (last = size - 1; last > 0; last = last - 1) {
            for (current = 0; current < last; current = current + 1) {

                if ((books[current+1].getAuthor()).compareToIgnoreCase(books[current].getAuthor()) < 0) {
                    temp = books[current];
                    books[current] = books[current + 1];
                    books[current + 1] = temp;
                }
            }
        }
        return books;
    }


    public static Book[] bubbleSortC(Book[] books) {
        int size = books.length;
        int last, current;
        Book temp;
        for (last = size - 1; last > 0; last = last - 1) {
            for (current = 0; current < last; current = current + 1) {

                if ((books[current+1].getTitle()).compareToIgnoreCase(books[current].getTitle()) < 0) {
                    temp = books[current];
                    books[current] = books[current + 1];
                    books[current + 1] = temp;
                }
            }
        }
        return books;
    }
}
