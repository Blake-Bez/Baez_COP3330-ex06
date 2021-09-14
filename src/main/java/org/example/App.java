/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;
import java.time.YearMonth;

public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("What is your current age? ");
            String startAge = input.nextLine();

            System.out.print("At what age would you like to retire? ");
            String endAge = input.nextLine();

            int f = Integer.parseInt(startAge);
            int s = Integer.parseInt(endAge);
            int year = YearMonth.now().getYear();

            System.out.println("You have " + (s-f) + " years left until you can retire.");
            System.out.println("It's " + year + ", so you can retire in " + (year+(s-f)) + ".");

        }
    }