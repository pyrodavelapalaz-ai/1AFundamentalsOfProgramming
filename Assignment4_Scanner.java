import java.util.Scanner;

/*
Jedi Knight Military Academy Application:
    - Height: At least 200cm
    - Age: 21-25, inclusive
    - Citizenship: Planet Endor
    EXCEPTION:
    - A recommendee of Jedi Master Obi Wan; Accepted automatically
    - “C” for citizen of Endor, “N” for non-citizen
    - “R” for recommendee, “N” for non-recommendee
    OUTPUT:
    - Accepted or Rejected.
 */


public class Assignment4_Scanner {
    public static void main(String[] args) {
        try {
            Scanner application = new Scanner(System.in);
            String p1 = "Coruscant";
            String p2 = "Tatooine";
            String p3 = "Naboo";
            String p4 = "Hoth";
            String p5 = "Endor";
            String p6 = "Mustafar";
            String p7 = "Kamino";
            String p8 = "Jakku";
            String p9 = "Dagobah";
            String p10 = "Others";

            String m1 = "Yoda";
            String m2 = "Mace Windu";
            String m3 = "Obi-Wan Kenobi";
            String m4 = "Anakin Skywalker";
            String m5 = "Qui-Gon Jinn";
            String m6 = "Ki-Adi-Mundi";
            String m7 = "Pio Koon";
            String m8 = "Kit Fisto";
            String m9 = "Aayla Secura";
            String m10 = "Others";

            System.out.println("Welcome to the Jedi Knight Military Academy Application! (✿◡‿◡)" + "\n" +
                    "Please enter your name:"
            );
            String name = application.nextLine().trim();

            System.out.println("\n" + "Are you a Recommendee?" + "\n" +
                    "1: " + "Yes" + "\n" +
                    "2: " + "No"
            );

            String rec = application.nextLine();
            int reqRec = Integer.parseInt(rec.trim());
            if (reqRec < 1 || reqRec > 2) {
                System.err.println("Invalid number! Please only pick from the choices. ^o^");
                application.close();
                return;
            }

            String rCode = "N";
            String masterName = "None";
            boolean autoAccepted = false;

            if (reqRec == 1) {
                System.out.println("Please choose the name of the Jedi Master who recommended you:" + "\n" +
                        "1: " + "Yoda" + "\n" +
                        "2: " + "Mace Windu" + "\n" +
                        "3: " + "Obi-Wan Kenobi" + "\n" +
                        "4: " + "Anakin Skywalker" + "\n" +
                        "5: " + "Qui-Gon Jinn" + "\n" +
                        "6: " + "Ki-Adi-Mundi" + "\n" +
                        "7: " + "Pio Koon" + "\n" +
                        "8: " + "Kit Fisto" + "\n" +
                        "9: " + "Aayla Secura" + "\n" +
                        "10: " + "Others"
                );

                String master = application.nextLine();
                int reqMaster = Integer.parseInt(master.trim());
                if (reqMaster < 1 || reqMaster > 10) {
                    System.err.println("Invalid number! Please only pick from the choices. ^o^");
                    application.close();
                    return;
                }

                if (reqMaster == 1) {
                    masterName = m1;
                }
                if (reqMaster == 2) {
                    masterName = m2;
                }
                if (reqMaster == 3) {
                    masterName = m3;
                }
                if (reqMaster == 4) {
                    masterName = m4;
                }
                if (reqMaster == 5) {
                    masterName = m5;
                }
                if (reqMaster == 6) {
                    masterName = m6;
                }
                if (reqMaster == 7) {
                    masterName = m7;
                }
                if (reqMaster == 8) {
                    masterName = m8;
                }
                if (reqMaster == 9) {
                    masterName = m9;
                }
                if (reqMaster == 10) {
                    masterName = m10;
                }

                if (reqMaster == 3) {
                    rCode = "R";
                    autoAccepted = true;
                    System.out.println("Congratulations! You are automatically accepted." + "\n" +
                            "Still, please input your information for your Applicant Code.");
                }
                else {
                    System.out.println("Unfortunately, you aren't automatically accepted." + "\n" +
                            "Please continue with the standard Jedi Knight Military Academy application." + "\n");
                }
            }
            if (reqRec == 2) {
                System.out.println("Please continue with the standard Jedi Knight Military Academy application." + "\n");
            }


            System.out.println("Enter your height (cm):");
            String height = application.nextLine();
            int reqHeight = Integer.parseInt(height.trim());
            if (reqHeight < 0) {
                System.err.println("Invalid format! Please positive digits only. ^o^");
                application.close();
                return;
            }

            System.out.println("Enter your age:");
            String age = application.nextLine();
            int reqAge = Integer.parseInt(age.trim());
            if (reqAge < 0) {
                System.err.println("Invalid format! Please positive digits only. ^o^");
                application.close();
                return;
            }

            System.out.println("Please choose the number of your Citizenship:" + "\n" +
                    "1: " + "Coruscant" + "\n" +
                    "2: " + "Tatooine" + "\n" +
                    "3: " + "Naboo" + "\n" +
                    "4: " + "Hoth" + "\n" +
                    "5: " + "Endor" + "\n" +
                    "6: " + "Mustafar" + "\n" +
                    "7: " + "Kamino" + "\n" +
                    "8: " + "Jakku" + "\n" +
                    "9: " + "Dagobah" + "\n" +
                    "10: " + "Others"
            );

            String citizenship = application.nextLine();
            int reqCitizenship = Integer.parseInt(citizenship.trim());
            if (reqCitizenship < 0) {
                System.err.println("Invalid format! Please positive digits only. ^o^");
                application.close();
                return;
            }
            if (reqCitizenship > 10) {
                System.err.println("Invalid number! Please only pick from the choices. ^o^");
                application.close();
                return;
            }

            String rejectedMSG = "REJECTED";
            String acceptedMSG = "ACCEPTED";

            System.out.println("Summary: " + "\n" + "=====================");
            if (reqHeight < 200) {
                System.out.println("Your height does not reach the requirement for the standard applicant." + "\n" +
                        "Your Height: " + reqHeight + "cm" + "\n" +
                        "Requirement: At least 200cm" + "\n");
            }
            if (reqHeight >= 200) {
                System.out.println("Your height meets the requirement for the standard applicant." + "\n" +
                        "Your Height: " + reqHeight + "cm" + "\n" +
                        "Requirement: At least 200cm" + "\n");
            }

            if (reqAge < 21 || reqAge > 25) {
                System.out.println("Your age does not reach the requirement for the standard applicant." + "\n" +
                        "Your Age: " + reqAge + "\n" +
                        "Requirement: Age 21-25, Inclusive" + "\n");
            }
            if (reqAge >= 21 && reqAge <= 25) {
                System.out.println("Your age meets the requirement for the standard applicant." + "\n" +
                        "Your Age: " + reqAge + "\n" +
                        "Requirement: Age 21-25, Inclusive" + "\n");
            }

            if (reqCitizenship == 5) {
                System.out.println("Your citizenship meets the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p5 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 1) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p1 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 2) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p2 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 3) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p3 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 4) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p4 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 6) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p6 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 7) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p7 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 8) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p8 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 9) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p9 + "\n" +
                        "Requirement: Endor Citizen" + "\n");
            }
            if (reqCitizenship == 10) {
                System.out.println("Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p10 + "\n" +
                        "Requirement: Endor Citizen");
            }
            System.out.println("=====================");

            if (autoAccepted) {
                System.out.println("Fortunately, you are ACCEPTED to the Jedi Knight Military Academy Application " +
                        "because you are a recommendee of Jedi Master Obi-Wan Kenobi.");
                System.out.println("Result: " + acceptedMSG);
            }
            else if (reqHeight < 200 || (reqAge < 21 || reqAge > 25) || reqCitizenship != 5) {
                System.out.println("Unfortunately, you are REJECTED from the Jedi Knight Military Academy Application " +
                        "due to the aforementioned reasons.");
                System.out.println("Result: " + rejectedMSG);
            }
            else {
                System.out.println("Fortunately, you are ACCEPTED to the Jedi Knight Military Academy Application " +
                        "due to the aforementioned reasons.");
                System.out.println("Result: " + acceptedMSG);
            }

            String cCode = (reqCitizenship == 5) ? "C" : "N";

            System.out.println("\n" + "Applicant Code:" + "\n" +
                    "Name: " + name + "\n" +
                    "Height: " + reqHeight + "\n" +
                    "Age: " + reqAge + "\n" +
                    "Citizenship: " + reqCitizenship + " (" + cCode + ")" + "\n" +
                    "Recommendee Code: " + rCode + "\n" +
                    "Jedi Master Recommendee: " + masterName + "\n");
            application.close();
            return;

        } catch (NumberFormatException e) {
            System.err.println("Invalid format! Please enter valid numbers only. ^o^");
        }
    }
}