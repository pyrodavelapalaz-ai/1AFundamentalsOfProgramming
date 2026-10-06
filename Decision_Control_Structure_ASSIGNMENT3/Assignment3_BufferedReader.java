package Decision_Control_Structure_ASSIGNMENT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
For Scholarship:
    REJECTED (any)
    - Parent's Salary: 10000+
    - NSAT Score: <90
    - Entrance Exam Score: <85

    ACCEPTED (all)
    - Parent's Salary: at most 3,500
    - Average of NSAT and Entrance Exam Score: >90
 */


public class Assignment3_BufferedReader {
    public static void main(String[] args) {

        BufferedReader scholarship = new BufferedReader(new InputStreamReader(System.in)); {
            try {
                System.out.println("Good Day!" + "\n" + "Welcome to your College Scholarship Availment b(￣▽￣)d" + "\n" +
                        "Please enter your name: ");
                String name = scholarship.readLine();
                System.out.println("Hello " + name + "!" + "\n" +
                        "In Order to see whether you are Qualified, " +
                        "Please Enter your Parent's Salary, NSAT Score, and Entrance Exam Score." + "\n" + "\n" +
                        "Qualification Reference: " + "\n" +
                        "ACCEPTED (if ALL of the following are met)" + "\n" +
                        "Parent's Salary:                        at most 3,500 Php" + "\n" +
                        "Average Score (NSAT and Entrance Exam): at least 91" + "\n" + "\n" +
                        "REJECTED (if ANY of the following are met)" + "\n" +
                        "Parent's Salary:                        above 10,000 Php" + "\n" +
                        "NSAT Score:                             below 90" + "\n" +
                        "Entrance Exam Score:                    below 85" + "\n"
                );

                String rejectedMSG = "Your availment for the College Scholarship is:" + "\n" + "REJECTED" + "\n";
                String acceptedMSG = "Your availment for the College Scholarship is:" + "\n" + "ACCEPTED" + "\n";
                String SFFSMSG = "Your availment for the College Scholarship is:" + "\n" +
                        "SUBJECTED FOR FURTHER STUDY" + "\n";

                System.out.println("Enter your Parent's Salary (Php): ");
                String salary = scholarship.readLine();
                double pSalary = Integer.parseInt(salary.trim());
                if (pSalary < 0) {
                    System.err.println("Invalid format! Please positive digits only. ^o^");
                    System.exit(0);
                }

                System.out.println("Enter your NSAT Score: ");
                String nsat = scholarship.readLine();
                int nsatScore = Integer.parseInt(nsat.trim());
                if (nsatScore < 0) {
                    System.err.println("Invalid score! Please enter valid scores only. ^o^");
                    System.exit(0);
                }

                System.out.println("Enter your Entrance Exam Score: ");
                String entranceExam = scholarship.readLine();
                int EEScore = Integer.parseInt(entranceExam.trim());
                if (EEScore < 0) {
                    System.err.println("Invalid score! Please enter valid scores only. ^o^");
                    System.exit(0);
                }

                double avgScore = nsatScore + EEScore;
                double avgScore1 = avgScore/2;

                System.out.println(
                        "\n" + "Summary:" + "\n" +
                        "Parent's Salary (Php): " + pSalary + "\n" +
                        "NSAT Score: " + nsatScore + "\n" +
                        "Entrance Exam Score: " + EEScore + "\n" +
                        "Average Score: " + avgScore1 + "\n");

                if (pSalary > 10000 || nsatScore < 90 || EEScore < 85) {
                    System.out.println(rejectedMSG);
                    System.out.println("Reason: " + "\n" + "Result is rejected due to qualification requirements not being met. " + "\n" +
                            "Check the Qualification Reference for more information.");
                    System.exit(0);
                }

                if (pSalary <= 3500 && avgScore1 >= 91) {
                    System.out.println(acceptedMSG);
                    System.out.println("Reason: " + "\n" + "Result is accepted due to qualification requirements being met. " + "\n" +
                            "Check the Qualification Reference for more information.");
                    System.exit(0);
                }

                else {
                    System.out.println(SFFSMSG);
                    System.out.println("Reason: " + "\n" + "Result is neither accepted nor rejected due to qualification requirement gap. " +
                            "Your Qualification is currently under Further Review." + "\n" +
                            "Check the Qualification Reference for more information.");
                    System.exit(0);
                }

            } catch (IOException e) {
                System.err.println("Error reading Input Stream.");
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter digits only. ^o^");
            }
        }
    }
}
