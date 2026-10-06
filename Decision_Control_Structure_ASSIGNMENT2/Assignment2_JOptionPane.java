package Decision_Control_Structure_ASSIGNMENT2;

import javax.swing.JOptionPane;

/*
Compute:
    - Hourly Pay Rate and Hours Worked
    - Gross Pay (Hours x Rate)
    - Withholding Tax:
        - 0-2000 (10%)
        - 2001-4000 (12%)
        - 4001-10000 (15%)
        - >10001 (20%)
    - Net Pay (Gross Pay - Withholding Tax)
 */

public class Assignment2_JOptionPane {
    public static void main(String[] args) {

        try {
            String msg2 = "Result:";
            String msg3 = "Invalid format! Please positive digits only. ^o^";
            String msg5 = "Good Day!";
            String msg6 = "Welcome to ABC Company q(≧▽≦q)";

            JOptionPane.showMessageDialog(null, msg6, msg5, JOptionPane.INFORMATION_MESSAGE);

            String msg7 = "In Order to see Your Current Net Pay, " +
                    "Please Enter your Hourly Rate and Hours Worked." + "\n" + "\n" +
                    "Withholding Tax Reference: " + "\n" +
                    "0-2000 Php:     (10%)" + "\n" +
                    "2001-4000 Php:  (12%)" + "\n" +
                    "4001-10000 Php: (15%)" + "\n" +
                    "10000+ Php:     (20%)" + "\n";

            JOptionPane.showMessageDialog(null, msg7, msg5, JOptionPane.INFORMATION_MESSAGE);

            String name = "";
            name = JOptionPane.showInputDialog("Please enter your name:");
            String nameMsg = "Hello " + name + "!";

            JOptionPane.showMessageDialog(null, nameMsg);

            String hours = "";
            String rate = "";

            rate = JOptionPane.showInputDialog("Enter your Hourly Pay (Php): ");

            double payRate = Integer.parseInt(rate.trim());
            if (payRate < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            hours = JOptionPane.showInputDialog("Enter your Hours Worked: ");

            double hoursWorked = Integer.parseInt(hours.trim());
            if (hoursWorked < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            String grossPaymsg = "Gross Pay (Php):        ";
            String WHTaxPercentagemsg = "Withholding Tax (%):  ";
            String WHTaxmsg = "Gross Tax (Php):        ";
            String netPaymsg = "Net Pay (Php):             ";

            double grossPay = hoursWorked * payRate;

            double WHTaxPercentage = 0;
            if (grossPay <= 2000) {
                WHTaxPercentage = 0.10;
                double WHTaxPercentage1 = WHTaxPercentage * 100;
            }
            if (grossPay > 2000 && grossPay <= 4000) {
                WHTaxPercentage = 0.12;
                double WHTaxPercentage1 = WHTaxPercentage * 100;
            }
            if (grossPay > 4000 && grossPay <= 10000) {
                WHTaxPercentage = 0.15;
                double WHTaxPercentage1 = WHTaxPercentage * 100;
            }
            if (grossPay > 10000) {
                WHTaxPercentage = 0.20;
                double WHTaxPercentage1 = WHTaxPercentage * 100;
            }

            double WHTax = grossPay * WHTaxPercentage;
            double netPay = grossPay - WHTax;

            String msg1 = String.format("%s %.02f %n%s %.02f %n%s %.02f %n%s %.02f",
                    grossPaymsg, grossPay,
                    WHTaxPercentagemsg, WHTaxPercentage * 100,
                    WHTaxmsg, WHTax,
                    netPaymsg, netPay);

            JOptionPane.showMessageDialog(null, msg1, msg2, JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            String msg2 = "Result:";
            String msg4 = "Invalid format! Please enter digits only. ^o^";
            JOptionPane.showMessageDialog(null, msg4, msg2, JOptionPane.ERROR_MESSAGE);
        }
    }
}
