package Amin.A3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Product productOne = new Product("Beer", 2, 3.9, 15);
        Product productTwo = new Product("Fries", 3, 4.5, 10);
        Product productThree = new Product("Burger", 2, 8.9, 10);
        Product productFour = new Product("Coke", 5, 1.99, 15);
        Product productFive = new Product("Lasagna", 1, 12.0, 10);
        Product productSix = new Product("Cake", 1, 4.5, 10);

        // two new invoices
        Invoice myInvOne = new Invoice(new ArrayList<Product>(Arrays.asList(
                productOne, productTwo, productThree, productFour, productFive)));

        Invoice myInvTwo = new Invoice(new ArrayList<Product>(Arrays.asList(
                productThree, productSix)));

        Invoice myInvThree = new Invoice(new ArrayList<Product>(Arrays.asList(
                productThree, productFour, productFive)));

        Invoice myInvFour = new Invoice(new ArrayList<Product>(Arrays.asList(
                productOne, productSix)));

        // create 3 new customers
        ArrayList<Invoice> invoiceArrayList = new ArrayList<>(Arrays.asList(myInvOne, myInvTwo));
        Customer customerOne = new Customer(01, new Date(), invoiceArrayList);

        ArrayList<Invoice> invoiceArrayList02 = new ArrayList<>(Arrays.asList(myInvThree, myInvFour));
        Customer customerTwo = new Customer(02, new Date(), invoiceArrayList02);

        ArrayList<Invoice> invoiceArrayList03 = new ArrayList<>(Arrays.asList(myInvThree, myInvTwo));
        Customer customerThree = new Customer(03, new Date(), invoiceArrayList03);

        // put 3 customers in an array
        ArrayList<Customer> customerArrayList = new ArrayList<>(
                Arrays.asList(customerOne, customerTwo, customerThree));


        // sum all
        double grossSum = 0;
        double netSum = 0;
        double taxSum = 0;
        for (Customer c : customerArrayList) {
            grossSum += c.getAllGrossSum();
            netSum += c.getAllNetSum();
            taxSum += c.getAllTaxSum();

        }
        System.out.println("\n============= sum of all invoices over all customers ==============");
        System.out.printf("%nSum before tax: %20.4f %nTax: %31.4f %nSum after tax: %21.4f %n",
                grossSum,taxSum, netSum);
    }
}

