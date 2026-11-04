package LAB_FINALS;

import java.io.*;

public class Assignment_Q1_BR {
    public static void main(String[] args) throws IOException {
        BufferedReader problem1 = new BufferedReader(new InputStreamReader(System.in));

        int highest = 0;
        int lowest = 0;

        // this part shows "Enter Number _:" until 10 only. used trim() to remove unnecessary spaces

        for (int listNumber = 1; listNumber <= 10; listNumber++) {
            System.out.print("Enter number " + listNumber + ": ");
            int num = Integer.parseInt(problem1.readLine().trim());

            // initiating values (starting point: "Enter number 1:")
            if (listNumber == 1) {
                highest = num;
                lowest = num;
            }
            // after listNumber 1 (e.g. "Enter number 2:")
            else {
                if (num > highest) {
                    highest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}
