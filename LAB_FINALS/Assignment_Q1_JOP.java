package LAB_FINALS;

import javax.swing.JOptionPane;

public class Assignment_Q1_JOP {
    public static void main(String[] args) {
        int highest = 0;
        int lowest = 0;

        // this part shows "Enter Number _:" until 10 only. used trim() to remove unnecessary spaces

        for (int listNumber = 1; listNumber <= 10; listNumber++) {
            String input = JOptionPane.showInputDialog("Enter number " + listNumber + ":");
            int num = Integer.parseInt(input.trim());

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
        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest + "\nLowest number: " + lowest);
    }
}
