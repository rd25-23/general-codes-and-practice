
class Ride {
    int rideNumber;
    String rideName;

    // Constructor to initialize the ride details
    public Ride(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }
}

// Main class to run the application
public class AmusementParkActivity {
    public static void main(String[] args) {
        // Storing the 5 rides using an array of objects
        Ride[] rides = new Ride[5];

        // Populating the array using the constructor
        rides[0] = new Ride(1, "Roller Coaster");
        rides[1] = new Ride(2, "Ferris Wheel");
        rides[2] = new Ride(3, "Bumper Cars");
        rides[3] = new Ride(4, "Water Ride");
        rides[4] = new Ride(5, "Haunted House");

        System.out.println("--- Ride Activity Levels ---");

        // Outer for loop to access each ride in the array
        for (int i = 0; i < rides.length; i++) {

            // Displaying the ride name, formatted to align the colons neatly
            System.out.printf("%-15s : ", rides[i].rideName);

            // Nested for loop to print the '*' pattern based on the ride number
            for (int j = 0; j < rides[i].rideNumber; j++) {
                System.out.print("*");
            }

            // Moving to the next line after printing the stars for the current ride
            System.out.println();
        }
    }
}
