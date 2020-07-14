package Amin.A1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {

        Author authorOne = new Author(                                  // author instance
                "Phil Knight",
                "phil.knight@nike.com",
                'm',
                "instagram.com/phil_knight");

        Author authorTwo = new Author(                                  // author instance
                "Jane Sam",
                "jn_sam@nike.com",
                'f',
                "instagram.com/jn_sam");

        // authors arraylist
        ArrayList<Author> authorsArrayList = new ArrayList<>(Arrays.asList(authorOne, authorTwo));

        Book bookOne = new Book("Shoe Dog", authorsArrayList, 12.5); // Book instance


        /*
        ** code written before last part
        *
        System.out.println("\n============ printing name of the book object =============");
        System.out.println(bookOne.getName());

        System.out.println("\n=========== Author's name and email using" +
                " 'getAuthor().getName()/getEmail()' ============");
        System.out.printf("%n%-20s %s%n", bookOne.getAuthor().getName(), bookOne.getAuthor().getEmail());

        System.out.println("\n============= printing book object - note the author! ==============");
        System.out.println(bookOne);


        System.out.println("\n=========== Author's name and email using" +
                " 'getAuthorName()' ============");
        System.out.println(bookOne.getAuthorName());


        System.out.println("\n=========== Author's full info using" +
                " 'authorInfo()' ============");
        bookOne.authorInfo();

         */


        System.out.println("\n============== printing book object with " +
                "multiple authors ====================");
        System.out.println(bookOne);


        System.out.println("\n=================== printing multiple authors  full information" +
                " ========================");
        bookOne.authorInfo();



    }
}
