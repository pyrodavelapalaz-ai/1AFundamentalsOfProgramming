package LAB_QUIZZES;// w/ Edmon Go (Group)

import javax.swing.JOptionPane;

public class labQuiz2 {
    public static void main(String[] args) {
        String name = "";
        String porkInput = "";

        name = JOptionPane.showInputDialog("Welcome to Adobo Cooking Show!" + System.lineSeparator() + "Enter your name:");

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);

        porkInput = JOptionPane.showInputDialog("How many kilo of pork will you cook?");

        double porkKg = Double.parseDouble(porkInput);

        Double soyAns = 0.5 * porkKg;
        Double vinAns = 0.33 * porkKg;

        String msg2 = "Here is the ratio for " + porkKg + "kg of pork:";
        String soy = "The ratio of soy sauce for " + porkKg + "kg is = " + soyAns + System.lineSeparator() +
                "The ratio of vinegar for " + porkKg + "kg is = " + vinAns;
        JOptionPane.showMessageDialog(null, soy, msg2, JOptionPane.INFORMATION_MESSAGE);

    }
}
