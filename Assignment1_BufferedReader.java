import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Write a program that would input the year and then indicate whether that year is a leap year or not.

public class Assignment1_BufferedReader {
    public static void main(String[] args) {

        BufferedReader year = new BufferedReader(new InputStreamReader(System.in)); {
            try {
                System.out.println("Enter your year:");
                String year1 = year.readLine();
                int leapYear = Integer.parseInt(year1.trim());
                    if (leapYear < 0) {
                        System.err.println("Invalid format! Please positive digits only. ^o^");
                        System.exit(0);
                    }

                boolean isLeap = (leapYear % 4 == 0);
                System.out.println(leapYear + (isLeap ? " is a Leap Year! ヾ(≧▽≦*)o" : " is NOT a Leap Year! (┬┬﹏┬┬)"));

            } catch (IOException e) {
                System.err.println("Error reading Input Stream.");
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter digits only. ^o^");
            }
        }
    }
}
