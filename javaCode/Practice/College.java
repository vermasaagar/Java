import java.util.*;

public class College {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("--------------------***********************-----------------");
        System.out.println("1.LPU(LOVELY PROFESSIONAL UNIVERSITY) PHAGWARA");
        System.out.println("2.Babu banarasi das university");
        System.out.println("3.Lucnkow University");
        System.out.println("4.Allahabad University");
        System.out.println("Enter your CGPA you scored in graduation: ");
        double cgpa = se.nextDouble();
        System.out.println("Choose University whrere you want to take admission in MCA program");
        int ul = se.nextInt();
        switch (ul) {
            case 1:
                System.out.println("You choose LPU Phagwara");
                System.out.println("Please enter your college admission test score (0-100): ");
                double score = se.nextDouble();
                if (cgpa >= 7.5) {
                    if (score >= 60)
                        System.out.println("Congratulations You are accepted! You can admit this college and you got 25% schoolarship.");
                    else
                        System.out.println("You are not accepted! Sorry, you can't admit this college.");
                } else if (score >= 80) {
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 30% schoolarship.");
                }
                else{
                    System.out.println("You are not accepted! Sorry, you can't admit this college.");
                }
                break;
            case 2:
                System.out.println("You choose Babu banarasi das university");
                System.out.println("Please enter your college admission test score (0-100): ");
                double sc = se.nextDouble();
                if (cgpa >= 7) {
                    if (sc >= 60)
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 20% schoolarship.");
                    else
                        System.out.println("You are not accepted! Sorry, you can't admit this college.");
                } else if (sc >= 80) {
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 30% schoolarship.");
                }
                break;
            case 3:
                System.out.println("You choose Lucnkow University");
                System.out.println("Please enter your college admission test score (0-100): ");
                double sco = se.nextDouble();
                if (cgpa >= 8) {
                    if (sco >= 75)
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 30% schoolarship.");
                    else
                        System.out.println("You are not accepted! Sorry, you can't admit this college.");
                } else if (sco >= 80) {
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 35% schoolarship.");
                }
                break;
            case 4:
                System.out.println("You choose Allahabad University");
                System.out.println("Please enter your college admission test score (0-100): ");
                double scor = se.nextDouble();
                if (cgpa >= 6.5) {
                    if (scor >= 60)
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 20% schoolarship.");
                    else
                        System.out.println("You are not accepted! Sorry, you can't admit this college.");
                } else if (scor >= 70) {
                    System.out.println("Congratulations You are accepted! You can admit this college and you got 25% schoolarship.");
                }
                break;
        }
        se.close();
    }

}