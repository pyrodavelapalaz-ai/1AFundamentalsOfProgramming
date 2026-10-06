package Decision_Control_Structure_ASSIGNMENT1;

import javax.swing.JOptionPane;

// Write a program that would input the year and then indicate whether that year is a leap year or not.

public class Assignment1_JOptionPane {
    public static void main(String[] args) {

        try {
            String year = "";

            year = JOptionPane.showInputDialog("Enter your year:");

            String msg2 = "Result:";
            String msg3 = "Invalid format! Please positive digits only. ^o^";

            int leapYear = Integer.parseInt(year.trim());
            if (leapYear < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean isLeap = ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0));

            String msg1 = (leapYear + (isLeap ? " is a Leap Year! ヾ(≧▽≦*)o" : " is NOT a Leap Year! (┬┬﹏┬┬)"));

            JOptionPane.showMessageDialog(null, msg1, msg2, JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            String msg2 = "Result:";
            String msg4 = "Invalid format! Please enter digits only. ^o^";
            JOptionPane.showMessageDialog(null, msg4, msg2, JOptionPane.ERROR_MESSAGE);
        }
    }
}