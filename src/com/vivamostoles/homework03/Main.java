package src.com.vivamostoles.homework03;

import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.Bookfields;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.utils.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      //Solution part 01 of the task
      List <Book> list = BookGenerator.generation(20);
      UsingForToPrint.usingFor(list);
      System.out.println("After using remove");
      RemoveBook.removeByIndex(6, list);
      UsingForToPrint.usingFor(list);


      //Solution part 01 of the task
       HashSet<Book> books = (HashSet<Book>) BookGeneratorForHashSet.generation(25, 6);
       UsingForToPrint.usingForHashSet(books);
       Set<Character> letters = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'));

        for (Book book : books) {
            String bookName = book.getLiteraryWork();
            Character firstLetter = bookName.charAt(0);
            if (letters.contains(firstLetter)) {
                System.out.println("task about letter>> " + bookName + " "
                        + book.getAuthorLastName() + " " + book.getAuthorFirstName() + " " + book.getPatronymicName());
            }
        }
        UsingForToPrint.usingForHashSet(books);



        SortedBook.sortBooks(books, Bookfields.NAME);
        SortedBook.sortBooks(books,Bookfields.FIRSTNAME);
        SortedBook.sortBooks(books,Bookfields.PATRONUMIC);
        SortedBook.sortBooks(books, Bookfields.LITERARYWORK);


         BookGenerator.creatingRandomLine(4);
         BookGenerator.getLineFromArray(AuthorLastNamesList.lastNames);


        TreeSet <String> students = TreeSetCreator.generation(7);
        for (String stude : students){
            System.out.println("after creat  " + stude); }
        TreeSetCreator.deleteStudent(students);

    }
}

