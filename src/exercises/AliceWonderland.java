package exercises;

import java.util.Scanner;

public class AliceWonderland {
    public static void main (String[] args) {
        System.out.println("Enter a search term");
        Scanner reader = new Scanner(System.in);
        String searchTerm = reader.next();
        reader.close();

        String aliceWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        if (aliceWonderland.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
