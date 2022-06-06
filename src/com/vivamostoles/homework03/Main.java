package src.com.vivamostoles.homework03;

import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.utils.BookGenerator;
import src.com.vivamostoles.homework03.utils.BookGeneratorForHashSet;
import src.com.vivamostoles.homework03.utils.RemoveBook;
import src.com.vivamostoles.homework03.utils.UsingForToPrint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    /*    List <Book> list = BookGenerator.generation(20);
         UsingForToPrint.usingFor(list);
      System.out.println("After using remove");
    RemoveBook.removeByIndex(6, list);
       UsingForToPrint.usingFor(list);*/
      HashSet <Book> books = BookGeneratorForHashSet.generation(19);
      Set<Character> letters = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o','u','y'));
      Book equalBook1 = new Book("Kupala", "Yanka", "Daminikavich", "Paulinka");
        Book equalBook2 = new Book("Kupal", "Yank", "Daminikavic", "Paulinka");
        Book equalBook3 = new Book("Kupa", "Yan", "Daminikavi", "Paulinka");
        Book equalBook4 = new Book("Kupa", "Yan", "Daminikav", "Paulinka");
        Book equalBook5 = new Book("Kup", "Ya", "Daminika", "Paulinka");
        Book equalBook6 = new Book("Ku", "Y", "Daminik", "Paulinka");
      books.add(equalBook1);
        books.add(equalBook2);
        books.add(equalBook3);
        books.add(equalBook4);
        books.add(equalBook5);
        books.add(equalBook6);
      //  UsingForToPrint.usingForHashSet(list);
     // System.out.println(books.contains("e"));
      for (Book book:books
           ) {
        String bookName = book.getLiteraryWork();
        Character firstLetter = bookName.charAt(0);
        if (letters.contains(firstLetter)) {
          System.out.println(bookName);
        }
      }





               /*HashSet <String> beatles = new HashSet<>(4);
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("George");
        beatles.add("Ringo");
        System.out.println(beatles);*/
    }}

