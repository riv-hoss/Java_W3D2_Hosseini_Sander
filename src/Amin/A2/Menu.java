package Amin.A2;

import java.util.ArrayList;

public class Menu {

    ArrayList<String> mainDish;
    ArrayList<String> desert;
    ArrayList<String> soup;
    String soupOfTheDat;


    public Menu(ArrayList<String> mainDish, ArrayList<String> desert,
                ArrayList<String> soup) {
        this.mainDish = mainDish;
        this.desert = desert;
        this.soup = soup;
        this.soupOfTheDat = soup.get(0); // first soup in the menu is the soup of the day

    }

    public void printMenu() {
        System.out.println("Today's main dishes are: \n" + mainDish + "\n"
                + "\nToday's deserts are: \n" + desert + "\n"
                + "\nToday's soups are: \n" + soup + "\n"
                + "\nSoup of the day is: \n" + soupOfTheDat);
    }

    public String getSoupOfTheDat() {
        return soupOfTheDat;
    }


}
