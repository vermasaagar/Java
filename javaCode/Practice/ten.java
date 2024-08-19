import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rahul's distance
        System.out.print("Enter the distance between Rahul's home and office (in km): ");
        double distance = sc.nextDouble();
        double totalDistance = distance * 2 * 5; // Rahul travels to office and back, 5 days a week
        System.out.println("Rahul travels " + totalDistance + " km in a week.");

        // Sachin's office time
        System.out.print("Enter the time taken by Sachin to reach office (in minutes): ");
        int travelTime = sc.nextInt();
        System.out.print("Enter the time Sachin left for office (in minutes before scheduled time): ");
        int earlyDepartureTime = sc.nextInt();
        if (earlyDepartureTime >= travelTime) {
            System.out.println("Sachin will be able to reach the office on time.");
        } else {
            System.out.println("Sachin will not be able to reach the office on time.");
        }

        sc.close();
    }
}
