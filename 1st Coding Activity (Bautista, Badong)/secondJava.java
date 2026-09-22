public class secondJava {
    public static void main(String[] args) {
        String firstName = "Dave Eric Barreto Bautista";
        String firstName2 = "Cyril Arcalas Badong";
        String address = "Santa Barbara, Pangasinan";
        String address2 = "Santo Tomas, Pangasinan";
        String contactNumber = "09460086601";
        String contactNumber2 = "09617683783";
        String design = "=== USER INFORMATION ===";
        int age = 18;
        int age2 = 18;
        String crush = "Karl";
        String crush2 = "none";
        {
            //printf formatting
            System.out.printf("%s %nName: %s %nAddress: %s %nContact Number: %s %nAge: %d %nCrush: %s %n %n",
                    design, firstName, address, contactNumber, age, crush);
            //println formatting
            System.out.println("Name: " + firstName2);
            System.out.println("Address: " + address2);
            System.out.println("Contact Number: " + contactNumber2);
            System.out.println("Age: " + age2);
            System.out.println("Crush: " + crush2);
            System.out.println(design);
        }
    }
}
