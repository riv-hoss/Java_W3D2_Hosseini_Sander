package Christian.A2;


import java.sql.SQLOutput;

public class WeekDayMenu extends Menu {

    WeekDayMenu(String mainDish,String soup, String desert){
        super (mainDish, soup,desert);
    }

    public void printMenu(){
        System.out.println(this.getMainDish());
        System.out.println(this.getSoup());
        System.out.println(this.getDesert());
    }

}
