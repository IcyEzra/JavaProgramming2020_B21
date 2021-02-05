package Replts.OOP_8_BookShelf;

import java.util.Arrays;
import Replts.OOP_8_BookShelf.Book;
import static Replts.OOP_8_BookShelf.Book.capitalize;
public class main {
    public static void main(String[] args) {
        String word = "";
        String words = "mArfIjunio tEmorov";
        String[] split = words.split(" ");
        String word2 = capitalize(words);
        System.out.println(word2);

        Book x = new Book(100,"Tolioken","Lord of the rings",1234);
        Book y = new Book(101,"ToliokenX","Lord of the rings 2",1234);
        Shelf.addBook(x);
        Shelf.addBook(101,"XXXXX","xxxx",123);

        x.getId();


    }
}
