package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.service.Bookfields;

import java.util.*;

public class SortedBook {
    public static Set<Book> booksorting(Set<Book> set, String s) {
        Set<Book> sortBook = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorLastName().compareTo(o2.getAuthorLastName());
            }
        });


        sortBook.addAll(set);
        return sortBook;
    }

    ;

    public static Set<Book> sortBooks(Set<Book> books, Bookfields field) {
        switch (field) {
            case NAME -> {
                Set<Book> sortBook = new TreeSet<>(new Comparator<Book>() {

                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorLastName().compareTo(o2.getAuthorLastName());
                    }
                });


                sortBook.addAll(books);
                for (Book printBook: sortBook
                     ) {
                    System.out.println("cheking sotWay>>>" + printBook);

                }

            }
            case FIRSTNAME -> {
                Set<Book> sortBook = new TreeSet<>(new Comparator<Book>() {

                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorFirstName().compareTo(o2.getAuthorFirstName());
                    }
                });

                sortBook.addAll(books);
                for (Book printBook: sortBook
                ) {
                    System.out.println("cheking sotWay FIRSTNAME>>>" + printBook);

                }

            }
        }
        return books;

    }

    ;
}




