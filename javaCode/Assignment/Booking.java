import java.util.ArrayList;
import java.util.HashMap;

public class Booking {
    // Define a HashMap to store the client's availability schedule
    // The keys are dates, and the values are ArrayLists of time slots that are available on that date
    private HashMap<String, ArrayList<String>> clientAvailability = new HashMap<>();

    // Define a method to add client's availability to the HashMap
    public void addAvailability(String date, ArrayList<String> timeslots) {
        clientAvailability.put(date, timeslots);
    }

    // Define a method to check if a client is free at a given date and time
    public boolean isClientFree(String date, String time) {
        // Check if the date is in the HashMap
        if (!clientAvailability.containsKey(date)) {
            return false;
        }
        // Check if the time is in the ArrayList for the given date
        if (!clientAvailability.get(date).contains(time)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a new BookingSystem object
        Booking bookingSystem = new Booking();

        // Add the client's availability
        ArrayList<String> availability = new ArrayList<>();
        availability.add("9:00");
        availability.add("10:00");
        availability.add("11:00");
        availability.add("13:00");
        availability.add("14:00");
        availability.add("15:00");
        bookingSystem.addAvailability("2023-03-01", availability);

        // Check if the client is free at a specific date and time
        String bookingDate = "2023-03-01";
        String bookingTime = "10:00";
        if (bookingSystem.isClientFree(bookingDate, bookingTime)) {
            System.out.println("Booking available for " + bookingDate + " at " + bookingTime);
            // Code to proceed with booking would go here
        } else {
            System.out.println("Booking not available for " + bookingDate + " at " + bookingTime);
        }
    }
}

