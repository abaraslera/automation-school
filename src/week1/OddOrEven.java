package week1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//for taking user input
        System.out.println("Please enter a number to check");
        int i = input.nextInt();//stored inpute value into i
        if (i%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd");

    }
}
