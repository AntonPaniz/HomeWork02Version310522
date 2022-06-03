package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.service.PatronymicNamesList;

import java.util.Random;

public class Bookgenerator {
    public static Book[] generacion(int numberOfBooksToMake) {
        Book [] books = new Book[numberOfBooksToMake];
        String [] authorLastName = AuthorLastNamesList.lastNames;
        String [] authorFirstName = AuthorFirstNamesList.firstNames;
        String [] patronymicName = PatronymicNamesList.patronymicNames;
        String [] literaryWork = LiteraryWorks.literaryWorks;
        for (int i = 0; i < books.length; i++) {
            int randomValueOfLastName = new Random().nextInt(authorLastName.length);
            int randomValueOfFirstName = new Random().nextInt(authorFirstName.length);
            int randomValueOfpatronymicName = new Random().nextInt(patronymicName.length);
            int randomValueOfliteraryWork = new Random().nextInt(LiteraryWorks.literaryWorks.length);
            Book bookFromGenerator = new Book(authorLastName[randomValueOfLastName],
                    authorFirstName[randomValueOfFirstName], patronymicName[randomValueOfpatronymicName],
                    literaryWork[randomValueOfliteraryWork]);

            books[i] = bookFromGenerator;
            System.out.println(books[i]);
        }
        return books;

    }

}
