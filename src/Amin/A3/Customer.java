package Amin.A3;
import java.util.*;

import java.util.ArrayList;

public class Customer {
    String name;
    int customerID;
    Date date;
    ArrayList<Invoice> invoices;

    public Customer(int customerID, Date date, ArrayList<Invoice> invoices) {
        this.customerID = customerID;
        this.date = date;
        this.invoices = invoices;
    }

    public double getAllGrossSum() { // return sum of all gross expenses
        double allGrossSum = 0;
        for (Invoice inv : this.invoices) {
            allGrossSum += inv.getGrossSum();
        }
        return allGrossSum;
    }

    public double getAllNetSum() { // return sum of all net expenses
        double allNetSum = 0;
        for (Invoice inv : this.invoices) {
            allNetSum += inv.getNetSum();
        }
        return allNetSum;
    }

    public double getAllTaxSum() { // return sum of all taxes
        double allTaxSum = 0;
        for (Invoice inv : this.invoices) {
            allTaxSum += inv.getTaxSum();
        }
        return allTaxSum;
    }
}
