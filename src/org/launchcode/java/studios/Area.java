package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        System.out.println("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = 3.14;
        double A = pi * r * r;
        System.out.println("The area of a circle of radius " + r + " is " + A);
    }
}
