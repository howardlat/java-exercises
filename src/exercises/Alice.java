package exercises;

import java.util.Scanner;

import static java.lang.System.*;

public class Alice {

    public static void main (String[] args) {
        out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
