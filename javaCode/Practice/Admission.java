package Practice;

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Print the list of universities
        System.out.println("Select a university to apply for admission: ");
        System.out.println("1. LPU (Lovely Professional University), Phagwara");
        System.out.println("2. Babu Banarasi Das University");
        System.out.println("3. Lucknow University");
        System.out.println("4. Allahabad University");
        
        // Get the user's choice of university and CGPA
        System.out.print("Enter the university number (1-4): ");
        int university = input.nextInt();
        System.out.print("Enter your CGPA you scored in BCA/BSE: ");
        double cgpa = input.nextDouble();
        
        // Get the user's admission test score
        System.out.print("Enter your admission test score (0-100): ");
        double admissionScore = input.nextDouble();
        
        // Calculate scholarship percentage based on CGPA and admission score
        double scholarship = 0;
        if (university == 1 && cgpa >= 7.5 && admissionScore >= 60) {
            scholarship = 0.25;
        } else if (university == 1 && admissionScore >= 80) {
            scholarship = 0.30;
        } else if (university == 2 && cgpa >= 7.0 && admissionScore >= 60) {
            scholarship = 0.20;
        } else if (university == 2 && admissionScore >= 80) {
            scholarship = 0.30;
        } else if (university == 3 && cgpa >= 8.0 && admissionScore >= 75) {
            scholarship = 0.30;
        } else if (university == 3 && admissionScore >= 80) {
            scholarship = 0.35;
        } else if (university == 4 && cgpa >= 6.5 && admissionScore >= 60) {
            scholarship = 0.20;
        } else if (university == 4 && admissionScore >= 70) {
            scholarship = 0.25;
        }
        
        // Check if the user is accepted or rejected
        if (scholarship > 0) {
            System.out.println("Congratulations! You are accepted at the university with a " + (scholarship * 100) + "% scholarship!");
        } else {
            System.out.println("Sorry, you are not accepted at the university.");
        }
        
        input.close();
    }
}
