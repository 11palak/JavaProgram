import java.util.Scanner;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your login id: ");
        String loginId = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidUser(loginId, password)) {
            System.out.println("Login successful. Welcome to the Reservation System.");
            System.out.print("Enter your basic details: ");
            String basicDetails = scanner.nextLine();

            System.out.print("Enter train number: ");
            String trainNumber = scanner.nextLine();

            System.out.print("Enter class type: ");
            String classType = scanner.nextLine();

            System.out.print("Enter date of journey: ");
            String dateOfJourney = scanner.nextLine();

            System.out.print("Enter source: ");
            String source = scanner.nextLine();

            System.out.print("Enter destination: ");
            String destination = scanner.nextLine();


            performReservation(basicDetails, trainNumber, classType, dateOfJourney, source, destination);

            System.out.print("Enter PNR number to cancel the ticket: ");
            String pnrNumber = scanner.nextLine();

         
            displayTicketDetails(pnrNumber);

            System.out.print("Press OK to confirm cancellation: ");
            String confirmCancellation = scanner.nextLine();

            if (confirmCancellation.equalsIgnoreCase("OK")) {

                performCancellation(pnrNumber);
                System.out.println("Ticket cancellation confirmed.");
            } else {
                System.out.println("Cancellation not confirmed.");
            }
        } else {
            System.out.println("Invalid login credentials. Access denied.");
        }
    }

    private static boolean isValidUser(String loginId, String password) {

        return loginId.equals("Roshan") && password.equals("8080");
    }

    private static void performReservation(String basicDetails, String trainNumber, String classType,
            String dateOfJourney, String source, String destination) {

        System.out.println("Reservation successful. Details inserted into the database.");
    }

    private static void displayTicketDetails(String pnrNumber) {


        System.out.println("Ticket details for PNR " + pnrNumber + " displayed.");
    }

    /**
     * @param pnrNumber
     */
    private static void performCancellation(String pnrNumber) {
       

        System.out.println("Cancellation for PNR " + pnrNumber + " performed.");
    }
}