// w/ Edmon Go (Group)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fifthJava {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your age: ");
            String ageInput = dataIn.readLine();
            int age = Integer.parseInt(ageInput);
            if (age <= 0) {
                System.out.println("How?");}

            System.out.println("Enter your exact height in metere: ");
            String heightInput = dataIn.readLine();
            double height = Double.parseDouble(heightInput);
            if (height <= 0) {
                System.out.println("Bro doesn't exist.");}

            System.out.println("You are " + age + " years old and " + height + "m tall.");

        }
        catch (IOException e) {
            System.err.println("Error reading Input Stream.");}
        catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}

