package Decision_Control_Structure_ASSIGNMENT2;

import java.util.Scanner;

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

public class Assignment2_Scanner {
    public static void main(String[] args) {

        Scanner totalPay = new Scanner(System.in);
        System.out.println("Good Day!" + "\n" + "Welcome to ABC Company q(≧▽≦q)" + "\n" + "Please enter your name: ");
        String name = totalPay.nextLine();
        System.out.println("Hello " + name + "!" + "\n" +
                "In Order to see Your Current Net Pay, " +
                "Please Enter your Hourly Rate and Hours Worked." + "\n" + "\n" +
                "Withholding Tax Reference: " + "\n" +
                "0-2000 Php:     (10%)" + "\n" +
                "2001-4000 Php:  (12%)" + "\n" +
                "4001-10000 Php: (15%)" + "\n" +
                "10000+ Php:     (20%)" + "\n"
        );
        
        System.out.println("Enter your Hourly Rate (Php): ");
        if (!totalPay.hasNextInt()) {
            System.err.println("Invalid format! Please enter digits only. ^o^");
            totalPay.close();
            return;
        }

        System.out.println("Enter your Hours Worked: ");
        if (!totalPay.hasNextInt()) {
            System.err.println("Invalid format! Please enter digits only. ^o^");
            totalPay.close();
            return;
        }

        int rate = totalPay.nextInt();
        if (rate < 0) {
            System.err.println("Invalid format! Please positive digits only. ^o^");
            totalPay.close();
            return;
        }

        int hours = totalPay.nextInt();
        if (hours < 0) {
            System.err.println("Invalid format! Please positive digits only. ^o^");
            totalPay.close();
            return;
        }

        String grossPaymsg = "Gross Pay (Php):     ";
        String WHTaxPercentagemsg = "Withholding Tax (%): ";
        String WHTaxmsg = "Gross Tax (Php):     ";
        String netPaymsg = "Net Pay (Php):       ";

        double grossPay = hours * rate;
        System.out.printf("%s %.02f %n", grossPaymsg, grossPay);
        double WHTaxPercentage = 0;
        if (grossPay <= 2000) {
            WHTaxPercentage = 0.10;
            System.out.printf("%s %.02f %n", WHTaxPercentagemsg, WHTaxPercentage * 100);
        }
        if (grossPay > 2000 && grossPay <= 4000) {
            WHTaxPercentage = 0.12;
            System.out.printf("%s %.02f %n", WHTaxPercentagemsg, WHTaxPercentage * 100);
        }
        if (grossPay > 4000 && grossPay <= 10000) {
            WHTaxPercentage = 0.15;
            System.out.printf("%s %.02f %n", WHTaxPercentagemsg, WHTaxPercentage * 100);
        }
        if (grossPay > 10000) {
            WHTaxPercentage = 0.20;
            System.out.printf("%s %.02f %n", WHTaxPercentagemsg, WHTaxPercentage * 100);
        }

        double WHTax = grossPay * WHTaxPercentage;
        System.out.printf("%s %.02f %n", WHTaxmsg, WHTax);

        double netPay = grossPay - WHTax;
        System.out.printf("%s %.02f %n", netPaymsg, netPay);

    }
}