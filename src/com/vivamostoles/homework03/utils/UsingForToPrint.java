package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;

import java.util.HashSet;
import java.util.List;

public class UsingForToPrint {
    public static void usingFor(List<Book> list){
        for (Book book : list) {
            System.out.println(book);
        }
    }
    public static void usingForHashSet( HashSet<Book> list){
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
