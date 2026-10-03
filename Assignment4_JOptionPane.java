import javax.swing.JOptionPane;

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


public class Assignment4_JOptionPane {
    public static void main(String[] args) {

        try {
            String msg1 = "Jedi Knight Military Academy";
            String msg2 = "Result:";
            String msg3 = "Invalid format! Please positive digits only. ^o^";
            String msg4 = "Invalid number! Please only pick from the choices. ^o^";
            String msg5 = "Welcome to the Jedi Knight Military Academy Application! (✿◡‿◡)";
            String msg6 = "Summary: ";

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

            JOptionPane.showMessageDialog(null, msg5, msg1, JOptionPane.INFORMATION_MESSAGE);

            String name = "";
            name = JOptionPane.showInputDialog("Please enter your name:");

            String rec = "";
            rec = JOptionPane.showInputDialog("Are you a Recommendee?" + "\n" +
                    "1: " + "Yes" + "\n" +
                    "2: " + "No"
            );

            int reqRec = Integer.parseInt(rec.trim());
            if (reqRec < 1 || reqRec > 2) {
                JOptionPane.showMessageDialog(null, msg4, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            String rCode = "N";
            String masterName = "None";
            boolean autoAccepted = false;

            if (reqRec == 1) {
                String master = "";
                master = JOptionPane.showInputDialog("Please choose the name of the Jedi Master who recommended you:" + "\n" +
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

                int reqMaster = Integer.parseInt(master.trim());
                if (reqMaster < 1 || reqMaster > 10) {
                    JOptionPane.showMessageDialog(null, msg4, msg2, JOptionPane.ERROR_MESSAGE);
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
                    JOptionPane.showMessageDialog(null, "Congratulations! You are automatically accepted." + "\n" +
                            "Still, please input your information for your Applicant Code.", msg1, JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Unfortunately, you aren't automatically accepted." + "\n" +
                            "Please continue with the standard Jedi Knight Military Academy application.", msg1, JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (reqRec == 2) {
                JOptionPane.showMessageDialog(null, "Please continue with the standard Jedi Knight Military Academy application.", msg1, JOptionPane.INFORMATION_MESSAGE);
            }


            String height = "";
            height = JOptionPane.showInputDialog("Enter your height (cm):");

            int reqHeight = Integer.parseInt(height.trim());
            if (reqHeight < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            String age = "";
            age = JOptionPane.showInputDialog("Enter your age:");

            int reqAge = Integer.parseInt(age.trim());
            if (reqAge < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            String citizenship = "";
            citizenship = JOptionPane.showInputDialog("Please choose the number of your Citizenship:" + "\n" +
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

            int reqCitizenship = Integer.parseInt(citizenship.trim());
            if (reqCitizenship < 0) {
                JOptionPane.showMessageDialog(null, msg3, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (reqCitizenship > 10) {
                JOptionPane.showMessageDialog(null, msg4, msg2, JOptionPane.ERROR_MESSAGE);
                return;
            }

            String rejectedMSG = "REJECTED";
            String acceptedMSG = "ACCEPTED";

            String heightMsg = "";
            if (reqHeight < 200) {
                heightMsg = "Your height does not reach the requirement for the standard applicant." + "\n" +
                        "Your Height: " + reqHeight + "cm" + "\n" +
                        "Requirement: At least 200cm";
            }
            if (reqHeight >= 200) {
                heightMsg = "Your height meets the requirement for the standard applicant." + "\n" +
                        "Your Height: " + reqHeight + "cm" + "\n" +
                        "Requirement: At least 200cm";
            }

            String ageMsg = "";
            if (reqAge < 21 || reqAge > 25) {
                ageMsg = "Your age does not reach the requirement for the standard applicant." + "\n" +
                        "Your Age: " + reqAge + "\n" +
                        "Requirement: Age 21-25, Inclusive";
            }
            if (reqAge >= 21 && reqAge <= 25) {
                ageMsg = "Your age meets the requirement for the standard applicant." + "\n" +
                        "Your Age: " + reqAge + "\n" +
                        "Requirement: Age 21-25, Inclusive";
            }

            String citizenMsg = "";
            if (reqCitizenship == 5) {
                citizenMsg = "Your citizenship meets the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p5 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 1) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p1 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 2) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p2 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 3) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p3 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 4) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p4 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 6) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p6 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 7) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p7 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 8) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p8 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 9) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p9 + "\n" +
                        "Requirement: Endor Citizen";
            }
            if (reqCitizenship == 10) {
                citizenMsg = "Your citizenship does not meet the requirement for the standard applicant." + "\n" +
                        "Your Citizenship: " + p10 + "\n" +
                        "Requirement: Endor Citizen";
            }

            String msg8 = heightMsg + "\n" + "\n" +
                    ageMsg + "\n" + "\n" +
                    citizenMsg;

            JOptionPane.showMessageDialog(null, msg8, msg6, JOptionPane.INFORMATION_MESSAGE);

            if (autoAccepted) {
                JOptionPane.showMessageDialog(null, "Fortunately, you are ACCEPTED to the Jedi Knight Military Academy Application" + "\n" +
                        "because you are a recommendee of Jedi Master Obi-Wan Kenobi." + "\n" + "\n" +
                        acceptedMSG, msg2, JOptionPane.INFORMATION_MESSAGE);
            }
            else if (reqHeight < 200 || (reqAge < 21 || reqAge > 25) || reqCitizenship != 5) {
                JOptionPane.showMessageDialog(null, "Unfortunately, you are REJECTED from the Jedi Knight Military Academy Application" + "\n" +
                        "due to the aforementioned reasons." + "\n" + "\n" +
                        rejectedMSG, msg2, JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Fortunately, you are ACCEPTED to the Jedi Knight Military Academy Application" + "\n" +
                        "due to the aforementioned reasons." + "\n" + "\n" +
                        acceptedMSG, msg2, JOptionPane.INFORMATION_MESSAGE);
            }

            String cCode = (reqCitizenship == 5) ? "C" : "N";

            String appCodeMSG = "Name: " + name + "\n" +
                    "Height: " + reqHeight + "\n" +
                    "Age: " + reqAge + "\n" +
                    "Citizenship: " + reqCitizenship + " (" + cCode + ")" + "\n" +
                    "Recommendee Code: " + rCode + "\n" +
                    "Jedi Master Recommendee: " + masterName;

            JOptionPane.showMessageDialog(null, appCodeMSG, "Applicant Code:", JOptionPane.INFORMATION_MESSAGE);
            return;

        } catch (NumberFormatException e) {
            String msg2 = "Result:";
            String msg7 = "Invalid format! Please enter digits only. ^o^";
            JOptionPane.showMessageDialog(null, msg7, msg2, JOptionPane.ERROR_MESSAGE);
        }
    }
}