import java.io.*;

public class testing123go {
    public static void main(String[] args) {
        BufferedReader rizz = new BufferedReader(new InputStreamReader(System.in));
        String pickupLine = "";
        System.out.println("Give me your best pickup lines:");
        try {
            pickupLine = rizz.readLine();
            if (pickupLine.equals("You're like the dandelions in autumn spring")){
            System.out.println("I'm like the dandelions in autumn spring?" + " Thank you!");}
            else if (pickupLine.equals("mama mo blue")){
                System.out.print("mama mo green, tanga. 🤣🤣🤣");
            }
            else {
                System.out.println(pickupLine + "?" + " Damnnn, thanks bro.");
            }

        } catch (IOException e) {
            System.out.println("Error bes");
        }
    }
}