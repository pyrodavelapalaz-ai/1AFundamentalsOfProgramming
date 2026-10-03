import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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

public class Assignment2_BufferedReader {
    public static void main(String[] args) {

        BufferedReader totalPay = new BufferedReader(new InputStreamReader(System.in)); {
            try {
                System.out.println("Good Day!" + "\n" + "Welcome to ABC Company q(≧▽≦q)" + "\n" + "Please enter your name: ");
                String name = totalPay.readLine();
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
                String rate = totalPay.readLine();
                int payRate = Integer.parseInt(rate.trim());
                if (payRate < 0) {
                    System.err.println("Invalid format! Please positive digits only. ^o^");
                    System.exit(0);
                }

                System.out.println("Enter your Hours Worked: ");
                String hours = totalPay.readLine();
                int hoursWorked = Integer.parseInt(hours.trim());
                if (hoursWorked < 0) {
                    System.err.println("Invalid format! Please positive digits only. ^o^");
                    System.exit(0);
                }

                String grossPaymsg = "Gross Pay (Php):     ";
                String WHTaxPercentagemsg = "Withholding Tax (%): ";
                String WHTaxmsg = "Gross Tax (Php):     ";
                String netPaymsg = "Net Pay (Php):       ";

                double grossPay = hoursWorked * payRate;
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

            } catch (IOException e) {
                System.err.println("Error reading Input Stream.");
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter digits only. ^o^");
            }
        }
    }
}
