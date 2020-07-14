package Christian.Library;

public class Author {

    String name;
    String email;
    String instagram;
    char gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    Author (String name, String email, String instagram, char gender){

    }
    @Override
    public String toString() {
        return "Author{" +
                "Name='" + name + '\'' +
                ", E-mail='" + email + '\'' +
                ", Instagram='" + instagram + '\'' +
                ", Gender=" + gender +
                '}';
    }
}
