package src.com.vivamostoles.homework03;

import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.utils.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    /*  TreeSet <String> students = TreeSetCreator.generation(28);
      for (String stude : students){
        System.out.println(stude); }
      System.out.println(students);*/

 /*    List <Book> list = BookGenerator.generation(3);
      UsingForToPrint.usingFor(list);
     // System.out.println("After using remove");
     //  RemoveBook.removeByIndex(6, list);
       //UsingForToPrint.usingFor(list);*/
        HashSet<Book> books = (HashSet<Book>) BookGeneratorForHashSet.generation(25, 6);
        Set<Character> letters = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'));
        /*Book equalBook1 = new Book("Kupala", "Yanka", "Daminikavich", "Paulinka");
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
        books.add(equalBook6);*/
        UsingForToPrint.usingForHashSet(books);
        for (Book book : books) {
            String bookName = book.getLiteraryWork();
            Character firstLetter = bookName.charAt(0);
            if (letters.contains(firstLetter)) {
                System.out.println("task about letter>> " + bookName + " " + book.getAuthorLastName() + " " + book.getAuthorFirstName() + " " + book.getPatronymicName());
            }
        }
        //  List sortedList = new ArrayList(books);
  /*  List <Book> sortedList = new ArrayList<Book>(books);
      Collections.sort(sortedList);*/

    }
}

