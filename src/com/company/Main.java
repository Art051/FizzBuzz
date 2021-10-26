package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();

        if(((userInput % 5) == 0) && ((userInput % 3) == 0))
            System.out.println("FizzBuzz");
        else if(userInput % 3 == 0)
            System.out.println("Buzz");
        else if(userInput % 5 == 0)
            System.out.println("Fizz");
        else System.out.println(userInput);
    }
}
