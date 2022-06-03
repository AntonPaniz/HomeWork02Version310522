package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;

import java.util.List;

public class UsingForToPrint {
    public static void usingFor(List<Book> list){
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
