import java.util.Scanner;

public class Fitness {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the distance from home to office in km: ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter the number of days office is open in a week: ");
        int daysInWeek = sc.nextInt();
        
        double totalDistance = distance * 2 * daysInWeek;
        
        System.out.println("Rahul travels " + totalDistance + " km in a week to reach office.");
        
        System.out.print("Enter the time taken by Sachin to reach office in minutes: ");
        int timeTaken = sc.nextInt();
        
        System.out.print("Enter the time Sachin left for office in minutes before he was supposed to reach: ");
        int timeLeft = sc.nextInt();
        
        if (timeTaken + timeLeft <= 480) {
            System.out.println("Sachin will reach on time.");
        } else {
            System.out.println("Sachin will be late for office.");
        }
        
        sc.close();
    }

}
