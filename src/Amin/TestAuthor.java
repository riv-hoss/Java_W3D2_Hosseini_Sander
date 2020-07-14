package Amin;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author(
                "abc",
                "abc@abc.com",
                'm',
                "instagram.com/author");

        System.out.println("\n======== print email address using getter 'getEmail()' =========");
        System.out.println("The Email is: " + author.getEmail());
        System.out.println("\n======== print author object invokes 'toString()' =========");
        System.out.println(author);
    }

}
