import javax.swing.JOptionPane;

/*
Important info:
    - 17.75% salary increase
    - Retroactive 2 months ago

Required:
    - New Salary
    - Retroactive Balance (2 months)
 */

public class labQuiz3 {
    public static void main(String[] args) {
        String name = "";
        String oldSalary = "";

        name = JOptionPane.showInputDialog("Hello employee." + System.lineSeparator() + "Please enter your name:"  + System.lineSeparator() + "(Last Name, First Name, M.I.)");

        String msg = "Hello " + name + "!";

        JOptionPane.showMessageDialog(null, msg);

        oldSalary = JOptionPane.showInputDialog("A 17.75% salary increase was effective 2 months ago. Please enter your old salary in order to view your Final Salary and Retroactive Balance for 2 months.");

        double salary = Double.parseDouble(oldSalary);

        Double finalSalary = salary * 0.1775;
        Double finalSalary2 = salary + finalSalary;
        Double finalSalary3 = finalSalary * 2;

        String msg2 = "Your final salary after computations:";
        String msg3 = "Old Salary: " + salary  + " Pesos" + System.lineSeparator()
                + "New Salary: " + finalSalary2 + " Pesos" + System.lineSeparator()
                + "Retroactive balance (2 months): " + finalSalary + " x 2 = " + finalSalary3 + " Pesos";
        JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.INFORMATION_MESSAGE);
    }
}
