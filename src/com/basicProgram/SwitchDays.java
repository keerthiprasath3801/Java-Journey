package com.basicProgram;

import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a day : ");
        String day=in.next();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Entered day is a week day ");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Entered day is a weekend");
            default:
                System.out.println("Enter a valid day ");
        }
    }
}
