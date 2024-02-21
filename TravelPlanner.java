package task2;

import java.util.Scanner;

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather user input
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] destinations = new String[numDestinations];
        String[] dates = new String[numDestinations];

        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
            System.out.print("Enter date for destination " + (i + 1) + ": ");
            dates[i] = scanner.nextLine();
        }

        // Generate travel plan
        System.out.println("\nYour Travel Plan:");
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination " + (i + 1) + ": " + destinations[i]);
            System.out.println("Date: " + dates[i]);
            // Add more details like weather info, budget calculations, etc.
        }

        scanner.close();
    }
}
