// w/ Cyril Badong (Group)

import java.io.*;

public class thirdJava {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Please enter your name:");
        try {
            name = dataIn.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("Error bes");
        }
    }
}