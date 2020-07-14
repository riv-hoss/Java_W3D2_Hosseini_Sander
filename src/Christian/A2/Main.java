package Christian.A2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Menu monday = new WeekDayMenu("Hennile", "Saladsoup", "Banana Split");
        Menu tuesday = new WeekDayMenu("Fish", "Fishsoup", "Fish ice cream");

        Menu saturday = new WeekEndMenu("Deer", "Deersoup", "Deer ice cream", "Deer Drink");

        ArrayList<Menu> weekMenu = new ArrayList<>();

        weekMenu.add(monday);
        weekMenu.add(tuesday);
        weekMenu.add(saturday);



        for (Menu d : weekMenu) {
            if (d instanceof WeekDayMenu) {
                ((WeekDayMenu) d).printMenu();
                System.out.println("Soup of the day: "+d.getSoup());
            }
            if (d instanceof WeekEndMenu) {

                ((WeekEndMenu) d).printMenu();
                System.out.println("Soup of the day: "+d.getSoup());
            }

        }

    }
}

