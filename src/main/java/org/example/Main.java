package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] cities = {"Paris", "London", "Rome", "New York", "Madrid", "Berlin", "Tokyo"
                , "Moscow", "Athens", "Cairo", "Oslo", "Beijing", "Delhi", "Vienna", "Warsaw"
                , "Ottawa", "Amsterdam", "Stockholm", "Bangkok", "Brussels", "Dublin", "Helsinki"
                , "Jakarta", "Kiev", "Lisbon", "Manila"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the city: ");
        String playerCity = scanner.nextLine();
        char lastLetter = playerCity.charAt(playerCity.length() - 1);

        String computerCity = findCity(cities, lastLetter);

        if (computerCity != null) {
            System.out.println(computerCity);
            System.out.println("enter the next city");
            String playerNextCity = scanner.nextLine();

            if (playerNextCity.charAt(0) != computerCity.charAt(computerCity.length() - 1)) {
                System.out.println("u lost");
            }
        } else {
            System.out.println("You won!");
        }
    }

    public static String findCity(String[] cities, char start) {
        for (String city : cities) {
            if (city.equalsIgnoreCase().startsWith(String.valueOf(start))) {
                return city;
            }
        }
        return null;
    }
}