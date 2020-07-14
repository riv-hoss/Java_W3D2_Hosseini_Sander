package Christian.A2;



public abstract class Menu {
    private String mainDish;
    private String soup;
    private String desert;
    private String appetizer;


    Menu (String mainDish, String soup, String desert, String appetizer){
        this.mainDish=mainDish;
        this.soup=soup;
        this.desert=desert;
        this.appetizer=appetizer;
    }
    Menu (String mainDish, String soup, String desert){
        this.mainDish=mainDish;
        this.soup=soup;
        this.desert=desert;

    }
    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }









}


