package org.example;

import java.util.Date;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Retirement
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Date date = new Date();

        System.out.print( "What is your current age? " );
        Age current = new Age();
        current.setAge(input.next());
        System.out.print("At what age would you like to retire? ");
        Age goal = new Age();
        goal.setAge(input.next());

        int x = Integer.parseInt(goal.getAge());
        int y = Integer.parseInt(current.getAge());
        int z = x - y;
        System.out.printf("You have %d years left until you can retire.\n", z);

        int year = date.getYear() + 1900;
        System.out.printf("It's %d, so you can retire in %d.", year, year+z);

    }
}
