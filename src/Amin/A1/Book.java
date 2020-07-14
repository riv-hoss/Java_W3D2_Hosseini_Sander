package Amin.A1;

import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> author;
    private double price;
    private int quantity;

    // default constructor
    public Book () {

    }

    // value constructor one
    public Book(String name, ArrayList<Author> author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // value constructor two
    public Book(String name, ArrayList<Author> author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(ArrayList<Author> author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }



    public ArrayList<String> getAuthorName() {
        ArrayList<String> names = new ArrayList<>();
        for (Author a: this.author) {
            names.add(a.getName());
        }
        return new ArrayList<>(names); // return a reference not the actual names
    }

    public ArrayList<String>  getAuthorEmail() {
        ArrayList<String> emails = new ArrayList<>();
        for (Author a: this.author) {
            emails.add(a.getEmail());
        }
        return new ArrayList<>(emails); // return a reference not the actual email
    }

    public ArrayList<Object> getAuthorGender() {
        ArrayList<Object> genders = new ArrayList<>();
        for (Author a: this.author) {
            genders.add(a.getGender());
        }
        return new ArrayList<>(genders); // return a reference not the actual gender
    }

    public ArrayList<String> getAuthorInst() {
        ArrayList<String> instas = new ArrayList<>();
        for (Author a: this.author) {
            instas.add(a.getInstagram());
        }
        return new ArrayList<>(instas); // return a reference not the actual instagram link
    }


/*
    public void authorInfo() {

        for (int i = 1 ; i <= this.author.size(); i++)
        System.out.printf("%nName: %35s %nEmail: %39s %nGender: %28s %nInstagram: %38s%n",
                getAuthorName(),getAuthorEmail(), getAuthorGender(), getAuthorInst());
    }
 */

    public void authorInfo() {

        for (int i = 0 ; i < this.author.size(); i++)
            System.out.printf("%n--------------| Author %d |--------------" +
                            "%nName: %35s %nEmail: %39s %nGender: %28s %nInstagram: %38s%n",
                    (i+1), getAuthorName().get(i), getAuthorEmail().get(i),
                    getAuthorGender().get(i), getAuthorInst().get(i));
    }





}
