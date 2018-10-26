

/**
 * class InputTerminal Allows the user to add a book or a magazine to the
 * Bookstore through the terminal.
 *
 * @author Kostas Dimitriou & Markos Hatzitaskos
 * @version 1.0
 */
public class InputTerminal {

    // instance variables
    private String title, author;
    private int id, pages, price, chapters;
    private String[] authorList;

    /**
     * bookEntry method
     *
     * Responsible for getting user input for a new book entry in the bookstore.
     */
    public Book bookEntry() {
        InputOutput.output("");
        InputOutput.output("");
        InputOutput.output("===================");
        InputOutput.output("New bookstore entry");
        InputOutput.output("===================");
        InputOutput.output("");
        InputOutput.output("");
        InputOutput.output("");
        InputOutput.output("Book details");
        InputOutput.output("------------");
        InputOutput.output("");

        id = InputOutput.inputInt("id: ");
        while (id < 0 || id == 0) {
            InputOutput.output("Error: The id you entered was not a proper id number");
            id = InputOutput.inputInt("id: ");
        }

        title = InputOutput.inputString("title: ");
        while (title.trim().length() == 0 || title.trim().length() > 25) {
            InputOutput.output("Error: The title you entered was empty or has more than 25 characters");
            title = InputOutput.inputString("title: ");
        }

        pages = InputOutput.inputInt("pages: ");
        while (pages < 0 || pages == 0) {
            InputOutput.output("Error: The pages you entered was not a positive number");
            pages = InputOutput.inputInt("pages: ");
        }

        price = InputOutput.inputInt("price ($): ");
        while (price < 0 || price == 0) {
            InputOutput.output("Error: The price you entered was not a positive number");
            price = InputOutput.inputInt("price: ($)");
        }

        chapters = InputOutput.inputInt("chapters: ");
        while (chapters < 0 || chapters == 0) {
            InputOutput.output("Error: The chapters you entered was not a positive number");
            chapters = InputOutput.inputInt("chapters: ");
        }

        author = InputOutput.inputString("author: ");

        while (author.trim().length() == 0 || title.trim().length() > 25) {
            InputOutput.output("Error: The author name you entered was empty or has more than 25 characters");
            author = InputOutput.inputString("author: ");
        }

        Book b = new Book(id, title, pages, price, chapters, author);

        return b;
    }
}
