package Amin.A2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMenu {

    public static void main(String[] args) {

        ArrayList<String> mainDishesOne = new ArrayList<>(Arrays.asList("Noodle", "Spaghetti", "Toast", "Burger"));
        ArrayList<String> desertsOne = new ArrayList<>(Arrays.asList("Fruit mix", "Brownie"));
        ArrayList<String> soupsOne = new ArrayList<>(Arrays.asList("Dal", "Chicken soup", "Cream soup"));

        ArrayList<String> mainDishesTwo = new ArrayList<>(Arrays.asList("Lasagna", "Beef toast", "Goulash"));
        ArrayList<String> desertsTwo = new ArrayList<>(Arrays.asList("Ice cream", "pie"));
        ArrayList<String> soupsTwo = new ArrayList<>(Arrays.asList("Avocado soup", "Ramen", "Soto"));

        ArrayList<String> appetizers = new ArrayList<>(Arrays.asList("Caesar salad", "Spring roll"));




        Menu dayMenuOne = new WeekdayMenu(mainDishesOne, desertsOne, soupsOne);
        Menu dayMenuTwo = new WeekdayMenu(mainDishesTwo, desertsTwo, soupsTwo);

        Menu weekendMenuOne = new WeekendMenu(appetizers, mainDishesTwo,desertsOne, soupsTwo);

        System.out.println("================ print a WEEKDAY menu ================");
        dayMenuOne.printMenu();

        System.out.println("================ print a WEEKEND menu ================");
        weekendMenuOne.printMenu();

        System.out.println("================ print a WEEKEND menu ================");
        weekendMenuOne.getSoupOfTheDat();


    }
}
