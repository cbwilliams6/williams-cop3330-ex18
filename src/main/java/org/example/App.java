package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String choice = input.nextLine();

        double celsius, fahrenheit, temp = 0;
        String strTemp = "";

        System.out.print("Please enter the temperature in ");
        if(choice.equalsIgnoreCase("c")){
            strTemp = "Fahrenheit";
            System.out.print(strTemp + ": ");
            fahrenheit = input.nextDouble();
            temp = (fahrenheit - 32) * 5 / 9;
        }
        else if(choice.equalsIgnoreCase("f")){
            strTemp = "Celsius";
            System.out.print(strTemp + ": ");
            celsius = input.nextDouble();
            temp = (celsius * 9 / 5) + 32;
        }

        System.out.println("The temperature in " + strTemp + " is " + temp);
    }
}