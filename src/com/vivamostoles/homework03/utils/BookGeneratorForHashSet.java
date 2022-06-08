package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.service.PatronymicNamesList;

import java.util.*;

public class BookGeneratorForHashSet {
    public static Set<Book> generation(int numberOfBooksToMake, int numberOfSameBooksToMake) {

        int numberOfDiffrentBooksToMake = numberOfBooksToMake - numberOfSameBooksToMake;

        Set<Book> books = new HashSet<>();

        String[] authorLastName = AuthorLastNamesList.lastNames;
        String[] authorFirstName = AuthorFirstNamesList.firstNames;
        String[] patronymicName = PatronymicNamesList.patronymicNames;
        String[] literaryWork = LiteraryWorks.literaryWorks;

        int randomValueOfLastName = new Random().nextInt(authorLastName.length);
        int randomValueOfFirstName = new Random().nextInt(authorFirstName.length);
        int randomValueOfpatronymicName = new Random().nextInt(patronymicName.length);
        int randomValueOfliteraryWork = new Random().nextInt(LiteraryWorks.literaryWorks.length);

        for (int i = 0; i < numberOfSameBooksToMake; i++) {
            books.add(
                    new Book(authorLastName[randomValueOfLastName],
                            authorFirstName[randomValueOfFirstName],
                            patronymicName[randomValueOfpatronymicName],
                            literaryWork[randomValueOfliteraryWork]));
                    }
        // System.out.println(books);}
        return books;
      /*  for (int i = 0; i < numberOfSameBooksToMake; i++) {
            Book sameBooksFromGenerator = new Book(authorLastName,
                    authorFirstName, patronymicName,
                    literaryWork);
            books.add(sameBooksFromGenerator);*/

        }
    }

