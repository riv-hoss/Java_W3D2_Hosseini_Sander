package Christian.A2;

public class WeekEndMenu extends Menu {

    WeekEndMenu (String mainDish, String soup, String desert, String appetizer){
        super (mainDish, soup, desert, appetizer);
    }
    public void printMenu(){
        System.out.println(this.getMainDish());
        System.out.println(this.getSoup());
        System.out.println(this.getDesert());
        System.out.println(this.getAppetizer());
    }

}
