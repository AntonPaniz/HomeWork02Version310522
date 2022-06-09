package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsingForToPrint {
    public static void usingFor(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }

    public static void usingForHashSet(HashSet<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }

    public static void usingForInSwitch(Set<Book> list) {
        for (Book printBook : list) {
            System.out.println("cheking >>>  " + printBook);
        }
    }
}
