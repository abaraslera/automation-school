package week1;

import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        int inches;
        double cm;
        double rate = 2.54;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter inches that needs to be converted");
        inches = input.nextInt(); //store input value inot inches
        cm = rate * inches;
        System.out.println("Centimetrs: " + cm);

    }
}