package src.com.vivamostoles.homework03;

import src.com.vivamostoles.homework03.utils.BookGenerator;
import src.com.vivamostoles.homework03.utils.BookGeneratorForHashSet;
import src.com.vivamostoles.homework03.utils.RemoveBook;
import src.com.vivamostoles.homework03.utils.UsingForToPrint;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*    List <Book> list = BookGenerator.generation(20);
         UsingForToPrint.usingFor(list);
      System.out.println("After using remove");
    RemoveBook.removeByIndex(6, list);
       UsingForToPrint.usingFor(list);*/
        HashSet <Book> listOfBooksFromHashSet = BookGeneratorForHashSet.generation(3);
    }}

