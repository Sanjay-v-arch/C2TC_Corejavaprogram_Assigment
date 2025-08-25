package assignments.QuestionFive;
import java.util.*;
public class BookingDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Booking input
        String[] input = sc.nextLine().trim().split(",");
        if (input.length != 3) {
            System.out.println("Invalid input format for booking details.");
            sc.close();
            return;
        }

        String stageEvent = input[0].trim();
        String customer = input[1].trim();
        int noOfSeats = 0;
        try {
            noOfSeats = Integer.parseInt(input[2].trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number of seats.");
            sc.close();
            return;
        }

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode safely
        String choiceLine = "";
        while (choiceLine.isBlank()) {
            if (!sc.hasNextLine()) {
                System.out.println("Invalid choice");
                sc.close();
                return;
            }
            choiceLine = sc.nextLine().trim();
        }

        int choice = 0;
        try {
            choice = Integer.parseInt(choiceLine);
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        switch (choice) {
            case 1: // Cash
                try {
                    String amountLine = "";
                    while (amountLine.isBlank()) {
                        amountLine = sc.nextLine().trim();
                    }
                    double cashAmount = Double.parseDouble(amountLine);
                    booking.makePayment(cashAmount);
                } catch (Exception e) {
                    System.out.println("Invalid amount.");
                }
                break;

            case 2: // Wallet
                try {
                    double walletAmount = Double.parseDouble(sc.nextLine().trim());
                    String walletNumber = sc.nextLine().trim();
                    booking.makePayment(walletAmount, walletNumber);
                } catch (Exception e) {
                    System.out.println("Invalid wallet payment details.");
                }
                break;

            case 3: // Credit Card
                try {
                    String cardHolder = sc.nextLine().trim();
                    double cardAmount = Double.parseDouble(sc.nextLine().trim());
                    String cardType = sc.nextLine().trim();
                    String ccv = sc.nextLine().trim();
                    booking.makePayment(cardHolder, cardAmount, cardType, ccv);
                } catch (Exception e) {
                    System.out.println("Invalid credit card payment details.");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

}
