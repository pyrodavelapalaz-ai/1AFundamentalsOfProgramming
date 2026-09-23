// w/ Edmon Go (Group)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class labQuiz1 {
    public static void main(String[] args) {
        BufferedReader labQuiz = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your Birth Year: ");
            String yearInput = labQuiz.readLine();
            int year = Integer.parseInt(yearInput);

            System.out.println("You were born last " + year + ".");

            int finalAge = 2026 - year ;

            System.out.println("You are now " + finalAge + " years old.");

            if (year > 2026) {
                System.out.println("Bro is from the future.");
            }
        }
        catch (IOException e) {
            System.err.println("Error reading Input Stream.");}
        catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}

