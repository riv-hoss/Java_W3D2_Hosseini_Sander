package Christian.Library;



public class TestAuthor {



    public static void main(String[] args) {
        Author author = new Author ("abc", "abc@abc.com", "instagram.com/author", 'm');

        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getInstagram());
        System.out.println(author.getGender());

    }
}
