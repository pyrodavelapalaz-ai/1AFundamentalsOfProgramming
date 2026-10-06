package Decision_Control_Structure_ASSIGNMENT1;

import java.util.Scanner;

// Write a program that would input the year and then indicate whether that year is a leap year or not.

public class Assignment1_Scanner {
    public static void main(String[] args) {

        Scanner leapYear = new Scanner(System.in);
        System.out.println("Enter your year: ");
        if (!leapYear.hasNextInt()) {
            System.err.println("Invalid format! Please enter digits only. ^o^");
            leapYear.close();
            return;
        }

        int year = leapYear.nextInt();
        if (year < 0) {
            System.err.println("Invalid format! Please positive digits only. ^o^");
            leapYear.close();
            return;
        }

        boolean isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        System.out.println(year + (isLeap ? " is a Leap Year! ヾ(≧▽≦*)o" : " is NOT a Leap Year! (┬┬﹏┬┬)"));
    }
}