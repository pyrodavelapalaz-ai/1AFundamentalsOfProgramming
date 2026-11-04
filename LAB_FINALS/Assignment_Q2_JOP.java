package LAB_FINALS;

import javax.swing.JOptionPane;

public class Assignment_Q2_JOP {
    public static void main(String[] args) {

        // output message
        String msg = "";

        // setting up parameters; 2 to 100 (inclusive). only even numbers

        for (int num = 2; num <= 100; num += 2) {
            msg += num + "  ";

            // every multiple of 20; new line

            if (num % 20 == 0) {
                msg += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
