package Amin.A3;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Product> items;

    public Invoice() {

    }

    public Invoice(ArrayList<Product> items) {
        if (items.size() > 5) { // check if 5 products or less were given
            return; // should find a way to stop the program if there are more than 5 invoices??
        }
        this.items = items;


    }


    public double getGrossSum() {
        double grossSum = 0;
        for (Product item : this.items) {
            grossSum += item.pricePerUnit * item.quantity;
        }
        return grossSum;
    }

    public double getNetSum() {
        double netSum = 0;
        for (Product item : this.items) {
            double grossSum = item.pricePerUnit * item.quantity;
            netSum += grossSum * ((100.0 - item.taxPercentage) / 100.0);
        }
        return netSum;
    }

    public double getTaxSum() {
        double taxSum = 0;
        for (Product item : this.items) {
            double grossSum = item.pricePerUnit * item.quantity;
            double netSum = grossSum * ((100.0 - item.taxPercentage) / 100.0);
            taxSum += grossSum - netSum;
        }
        return taxSum;
    }
}
