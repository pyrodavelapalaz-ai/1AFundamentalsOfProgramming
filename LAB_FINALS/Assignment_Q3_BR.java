package LAB_FINALS;

import java.io.*;

public class Assignment_Q3_BR {
    public static void main(String[] args) {
        try {
            BufferedReader problem3 = new BufferedReader(new InputStreamReader(System.in));

            // starting value
            double balance = 20000.00;

            // input value
            double amount;

            // used do-while since it needs to loop after checking the input value (amount)

            do {
                System.out.print("Enter amount (Press 0 to Stop): ");
                amount = Double.parseDouble(problem3.readLine().trim());

                if (amount > 0) {
                    // deposit. add to balance
                    balance += amount;
                } else if (amount < 0) {
                    // withdrawal. used "-" sign to convert negative input to positive for comparing
                    if (-amount > balance) {
                        System.out.println("INSUFFICIENT FUNDS!");
                    }
                    // withdrawal. would deduct from balance
                    else {
                        balance += amount;
                    }
                }
                if (amount != 0) {
                    System.out.println("Balance: P" + String.format("%, .2f", balance));
                }
            }
            // 0 sentinel. the loop stops if the input value is 0
            while (amount != 0);
        } catch (IOException e) {
            System.err.println("Invalid Format! Please try again");
        }
    }
}
