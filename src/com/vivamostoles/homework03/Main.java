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
      HashSet <Book> list = BookGeneratorForHashSet.generation(2);
      Book equalBook1 = new Book("Kupala", "Yanka", "Daminikavich", "Paulinka");
        Book equalBook2 = new Book("Kupal", "Yank", "Daminikavic", "Paulinka");
        Book equalBook3 = new Book("Kupa", "Yan", "Daminikavi", "Paulinka");
        Book equalBook4 = new Book("Kupa", "Yan", "Daminikav", "Paulinka");
        Book equalBook5 = new Book("Kup", "Ya", "Daminika", "Paulinka");
        Book equalBook6 = new Book("Ku", "Y", "Daminik", "Paulinka");
      list.add(equalBook1);
        list.add(equalBook2);
        list.add(equalBook3);
        list.add(equalBook4);
        list.add(equalBook5);
        list.add(equalBook6);
        UsingForToPrint.usingForHashSet(list);
        /*for (Book book : listOfBooksFromHashSet) {
            System.out.println(listOfBooksFromHashSet);}*/
        // System.out.println(listOfBooksFromHashSet);

        /*HashSet <String> beatles = new HashSet<>(4);
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("George");
        beatles.add("Ringo");
        System.out.println(beatles);*/
    }}

