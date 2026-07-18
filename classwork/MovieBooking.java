import java.util.Scanner;

// Custom Exception
class SeatsNotAvailableException extends Exception {
    public SeatsNotAvailableException(String message) {
        //hello
        super(message);
    }
}

public class MovieBooking {

    static int availableSeats = 30;

    static void bookTicket(int seats)
            throws SeatsNotAvailableException {

        if (seats > availableSeats) {
            throw new SeatsNotAvailableException("Requested seats are not available.");
        }

        availableSeats -= seats;

        System.out.println("Booking Successful!");
        System.out.println("Seats Booked : " + seats);
        System.out.println("Remaining Seats : " + availableSeats);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("=== Movie Ticket Booking ===");
            System.out.println("Available Seats: " + availableSeats);

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            if (seats <= 0) {
                throw new IllegalArgumentException("Seat count must be greater than 0.");
            }

            bookTicket(seats);

        }
        catch (SeatsNotAvailableException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input! Enter numbers only.");
        }
        finally {
            System.out.println("Thank you! Visit Again.");
            sc.close();
        }
    }
}