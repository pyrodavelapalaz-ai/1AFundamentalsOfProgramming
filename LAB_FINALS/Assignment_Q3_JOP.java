package LAB_FINALS;

import javax.swing.JOptionPane;

public class Assignment_Q3_JOP {
    public static void main(String[] args) {

        // starting value
        double balance = 20000.00;

        // input value
        double amount;

        do {
            String input = JOptionPane.showInputDialog("Enter amount (Press 0 to Stop):");
            amount = Double.parseDouble(input.trim());

            // output message
            String msg = "";

            if (amount > 0) {
                // deposit. add to balance
                balance += amount;
            } else if (amount < 0) {
                // withdrawal. used "-" sign to convert negative input to positive for comparing
                if (-amount > balance) {
                    msg = "INSUFFICIENT FUNDS!\n";
                }
                // withdrawal. would deduct from balance
                else {
                    balance += amount;
                }
            }
            if (amount != 0) {
                JOptionPane.showMessageDialog(null,
                        msg + "Balance: P" + String.format("%.2f", balance));
            }
        }
        // 0 sentinel. the loop stops if the input value is 0
        while (amount != 0);
    }
}
