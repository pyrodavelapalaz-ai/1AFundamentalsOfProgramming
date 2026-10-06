package Decision_Control_Structure_ASSIGNMENT3;

import javax.swing.JOptionPane;

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

public class Assignment3_JOptionPane {
    public static void main(String[] args) {

        try {
            String msg2 = "Result:";
            String msg3 = "Invalid format! Please positive digits only. ^o^";
            String msg5 = "Good Day!";
            String msg6 = "Welcome to your College Scholarship Availment b(￣▽￣)d";
            String msg9 = "Summary: ";
            String msg10 = "\n" +
                    "Qualification Reference: " + "\n" +
                    "ACCEPTED (if ALL of the following are met)" + "\n" +
                    "Parent's Salary:             at most 3,500 Php" + "\n" +
                    "Average Score (NSAT and Entrance Exam):   at least 91" + "\n" + "\n" +
                    "REJECTED (if ANY of the following are met)" + "\n" +
                    "Parent's Salary:            above 10,000 Php" + "\n" +
                    "NSAT Score:                 below 90" + "\n" +
                    "Entrance Exam Score:        below 85" + "\n";

            String rejectedMSG = "Your availment for the College Scholarship is:" + "\n" + "REJECTED" + "\n";
            String acceptedMSG = "Your availment for the College Scholarship is:" + "\n" + "ACCEPTED" + "\n";
            String SFFSMSG = "Your availment for the College Scholarship is:" + "\n" +
                    "SUBJECTED FOR FURTHER STUDY";

            JOptionPane.showMessageDialog(null, msg6, msg5, JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "In Order to see whether you are Qualified, " +
                    "Please Enter your Parent's Salary, NSAT Score, and Entrance Exam Score." + "\n" + msg10, msg5, JOptionPane.INFORMATION_MESSAGE);

            String name = "";
            name = JOptionPane.showInputDialog("Please enter your name:");
            String nameMsg = "Hello " + name + "!";

            JOptionPane.showMessageDialog(null, nameMsg);

            String salary = "";
            String nsat = "";
            String entranceExam = "";

            salary = JOptionPane.showInputDialog("Enter your Parent's Salary (Php): ");

            double pSalary = Integer.parseInt(salary.trim());
            if (pSalary < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            nsat = JOptionPane.showInputDialog("Enter your NSAT Score: ");

            int nsatScore = Integer.parseInt(nsat.trim());
            if (nsatScore < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            entranceExam = JOptionPane.showInputDialog("Enter your Entrance Exam Score: ");

            int EEScore = Integer.parseInt(entranceExam.trim());
            if (EEScore < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            double avgScore = nsatScore + EEScore;
            double avgScore1 = avgScore / 2;

            String msg8 =
                    "Parent's Salary (Php): " + pSalary + "\n" +
                    "NSAT Score: " + nsatScore + "\n" +
                    "Entrance Exam Score: " + EEScore + "\n" +
                    "Average Score: " + avgScore1;

            JOptionPane.showMessageDialog(null, msg8, msg9, JOptionPane.INFORMATION_MESSAGE);

            if (pSalary > 10000 || nsatScore < 90 || EEScore < 85) {
                JOptionPane.showMessageDialog(null, rejectedMSG);
                JOptionPane.showMessageDialog(null, "Reason: " + "\n" + "Result is rejected due to qualification requirements not being met. " + "\n" +
                        "Check the Qualification Reference for more information." + "\n" + msg10);
                return;
            }

            if (pSalary <= 3500 && avgScore1 >= 91) {
                JOptionPane.showMessageDialog(null, acceptedMSG);
                JOptionPane.showMessageDialog(null, "Reason: " + "\n" + "Result is accepted due to qualification requirements being met. " + "\n" +
                        "Check the Qualification Reference for more information." + "\n" + msg10);
                return;

            } else {
                JOptionPane.showMessageDialog(null, SFFSMSG);
                JOptionPane.showMessageDialog(null, "Reason: " + "\n" + "Result is neither accepted nor rejected due to qualification requirement gap. " +
                        "Your Qualification is currently under Further Review." + "\n" +
                        "Check the Qualification Reference for more information." + "\n" + msg10);
                return;
                }

        } catch (NumberFormatException e) {
            String msg2 = "Result:";
            String msg4 = "Invalid format! Please enter digits only. ^o^";
            JOptionPane.showMessageDialog(null, msg4, msg2, JOptionPane.ERROR_MESSAGE);
        }
    }
}