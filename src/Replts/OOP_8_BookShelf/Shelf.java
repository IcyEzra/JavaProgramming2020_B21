package Replts.OOP_8_BookShelf;

import java.util.*;
/**
 * Represents a book shelf.
 * Depends on Book class, so make sure Book class 100% done first
 */
public class Shelf {
    /**
     * Constructor is made private to prevent any instantiation.
     * Since all methods in this class are static that can be called
     * without an object
     */
    private Shelf() {
        //nothing todo here.
    }

    /**
     * List<Book> theBooks will hold all book object in the shelf
     * in form of a List of Book objects
     */
    private static ArrayList<Book> theBooks = new ArrayList<>();

    /**
     * public static getter method for theBooks list
     * @return theBooks
     */
    public static ArrayList<Book> getTheBooks() {

        return theBooks;
    }

    /**
     * isShelfEmpty is used to see if shelf is empty or not.
     * Shelf is empty when List<Book> theBooks has no Book objects added
     *
     * @return true if list is empty or false if not
     */
    public static boolean isShelfEmpty(){
        if(theBooks.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    /**
     * isIDUnique accepts an id and loops though each Book object in theBooks list
     * and if id was already assigned to another book, it will return false
     * If id was never used, it will return true
     * @param id
     * @return true or false
     */
    public static boolean isIDUnique(int id) {
        boolean x = false;
        for(Book each : theBooks){
            if(each.getId() == id){
                x = false;
            }else{
                x =  true;
            }
        }
        return x;
    }


    /**
     * static addBook method is used to add a book to the Shelf. to List<Book> theBooks
     * @param id
     * @param author
     * @param title
     * @param pages
     * @returns true if Book was successfully added or false if not
     * Conditions:
     *     returns false and does NOT add a book to the list if:
     *      - id is not unique. was already used by other books. Call isIDUnique to check that
     *      - title is empty
     *      - pages <= 0
     *     returns true and adds a new Book object to List<Book> theBooks if:
     *      - all above checks passed.
     *      Shelf.addBook(100,"j.K. rowLing","harry potter",556); => returns true
     *      and adds the book to the list:
     *         theBooks.add(new Book(id,author,title,pages));
     */
    public static boolean addBook(int id, String author, String title, int pages ){
        boolean x = false;
        if(isIDUnique(id) == false && pages > 0 && !title.isEmpty()){
            theBooks.add(new Book(id, author,title,pages));
            x = true;
        }else{
            x = false;
        }
        return x;
    }

    /**
     * static addBook method is used to add a book to the Shelf. to ArrayList<Book> theBooks
     * @param  book object
     * @return true if Book was successfully added or false if not
    Conditions:
     *     returns false and does NOT add a book to the list if:
     *      - book.getId() is not unique. was already used by other books. Call isIDUnique to check that
     *      - book's title is empty
     *      - book's pages <= 0
     *     returns true and adds the Book object to List<Book> theBooks if:
     *      - all above checks passed.
     *
     *      Book book1, book2;
     *      book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
     *      book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);
     *
     *      Shelf.addBook(book1); => true
     *      Shelf.addBook(book1); => true
     *
     */
    public static boolean addBook(Book book ){
        boolean x = false;
        if(isIDUnique(book.getId()) == false && book.getPages() > 0 && !book.getTitle().isEmpty()){
            theBooks.add(book);
            x = true;
        }else{
            x = false;
        }

        return x;
    }

    /**
     * static getTitleByID method looks up title of the Book by id
     * @param id
     * @return title
     * Loop through each book in Shelf (the theBooks list) and if you find a book
     * matching id then return that book's title
     * Ex:
     *  Assume we have Book id=100, title=Start With Why
     *  Shelf.getTitleByID(100); => "Start With Why"
     *  Shelf.getTitleByID(100534534); => "book not found"
     */
    public static String getTitleByID(int id) {
        String returnX = "";
        for(Book each : theBooks){
            if(each.getId() == id){
                returnX = each.getTitle();
            }else{
                returnX = "book not found";
            }
        }

        return returnX;
    }

    /**
     * static method findBookByPartialTitle
     * Looks for a book and if title parameter matches partially
     * return that book object.
     * @param title: partial string to match
     * @return Book object
     *
     * Assume we have Book id=100, title=Start With Why, Author: Simon Sinek
     *    Shelf.findBookByPartialTitle("start"); => returns that Book object
     *    Shelf.findBookByPartialTitle("why"); => returns that Book object
     *    Shelf.findBookByPartialTitle("Wooden Spoon); returns null
     *
     */
    public static Book findBookByPartialTitle(String title) {
        Book book = null;
        for(Book each : theBooks){
            if(each.getTitle().contains(title)){
                book = each;
            }else{
                book = null;
            }
        }

        return book;
    }

    /**
     * static method getAllBooksForAuthor.
     * Loops through each book in shelf(theBooks list) and returns
     * a new ArrayList<Book> objects for that author.
     * If no book is found for that author, returns an empty list
     * @param author
     * @return ArrayList<Book> that belongs to that Author
     */
    public static List<Book> getAllBooksForAuthor(String author) {
        ArrayList<Book> getBooks = new ArrayList<>();
        for(Book each : theBooks){
            if(each.getAuthor().equals(author)) {
                getBooks.add(each);
            }else{
                return getBooks;
            }
        }

        return getBooks;
    }

    /**
     * static removeBook method removes the Book from the Shelf(theBooks list)
     * @param id
     * Look for the book in the theBooks list that matches the id and remove it
     * if there is not match, no action needed
     */
    public static void removeBook(int id) {
        for(Book each : theBooks){
            if(each.getId() == id){
                theBooks.remove(each);
            }
        }

    }

    /**
     * static removeBook method removes the Book from the Shelf(theBooks list)
     * @param author
     * Look for the book in the theBooks list that matches the author and remove ALL of matches
     * if there is not match, no action needed
     */
    public static void removeBook(String author) {
        for(Book each : theBooks){
            if(each.getAuthor().equals(author)){
                theBooks.remove(each);
            }
        }

    }

    /**
     * Clears the BookShelf of all books
     */
    public static void clearBookShelf() {
        theBooks.clear();

    }




}
/*
Shelf.java:192: error: illegal start of expression
    public static List<Book> getAllBooksForAuthor(String author) {
    ^
Shelf.java:192: error: illegal start of expression
    public static List<Book> getAllBooksForAuthor(String author) {
           ^
Shelf.java:192: error: ';' expected
    public static List<Book> getAllBooksForAuthor(String author) {
                      ^
Shelf.java:192: error: illegal start of expression
    public static List<Book> getAllBooksForAuthor(String author) {
                             ^
Shelf.java:192: error: -> expected
    public static List<Book> getAllBooksForAuthor(String author) {
                                                                ^
Shelf.java:192: error: not a statement
    public static List<Book> getAllBooksForAuthor(String author) {
                                                 ^
Shelf.java:204: error: ';' expected
    }
     ^
Shelf.java:212: error: illegal start of expression
    public static void removeBook(int id) {
    ^
Shelf.java:212: error: ';' expected
    public static void removeBook(int id) {
          ^
Shelf.java:212: error: illegal start of expression
    public static void removeBook(int id) {
                  ^
Shelf.java:212: error: ';' expected
    public static void removeBook(int id) {
                                 ^
Shelf.java:212: error: ';' expected
    public static void removeBook(int id) {
                                        ^
Shelf.java:228: error: illegal start of expression
    public static void removeBook(String author) {
    ^
Shelf.java:228: error: illegal start of expression
    public static void removeBook(String author) {
           ^
Shelf.java:228: error: ';' expected
    public static void removeBook(String author) {
                 ^
Shelf.java:228: error: ')' expected
    public static void removeBook(String author) {
                                        ^
Shelf.java:228: error: illegal start of expression
    public static void removeBook(String author) {
                                               ^
Shelf.java:228: error: ';' expected
    public static void removeBook(String author) {
                                                ^
18 errors

exit status 1
 */
