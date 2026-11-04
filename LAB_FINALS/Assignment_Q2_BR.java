package LAB_FINALS;

import java.io.*;

public class Assignment_Q2_BR {
    public static void main(String[] args) {

        // setting up parameters; 2 to 100 (inclusive). only even numbers

        for (int num = 2; num <= 100; num += 2) {
            System.out.print(num + "  ");

            //every multiple of 20; new line

            if (num % 20 == 0) {
                System.out.println();
            }
        }
    }
}
