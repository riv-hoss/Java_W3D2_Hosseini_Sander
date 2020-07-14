package Amin.A2;

import java.util.ArrayList;

public class WeekendMenu extends Menu{
    ArrayList<String> appetizer;



    // value constructor
    public WeekendMenu(ArrayList<String> appetizer, ArrayList<String> mainDish,
                       ArrayList<String> desert, ArrayList<String> soup) {
        super(mainDish, desert, soup);
        this.appetizer = appetizer;
    }


    @Override // since it has appetizer as well
    public void printMenu() {
        System.out.println("Today's appetizers are: \n" + appetizer + "\n"
                +"\nToday's main dishes are: \n" + mainDish + "\n"
                + "\nToday's deserts are: \n" + desert + "\n"
                + "\nToday's soups are: \n" + soup + "\n"
                + "\nSoup of the day is: \n" + soupOfTheDat);
    }
}

