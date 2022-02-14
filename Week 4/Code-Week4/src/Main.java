import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxFuel, fuelEfficiency, petrolPrice;

        try {
            System.out.print("Please enter your car's max fuel: \n>");
            maxFuel = scanner.nextDouble();

            System.out.print("Please enter your car's fuel efficiency: \n>");
            fuelEfficiency = scanner.nextDouble();

            if (maxFuel > 0 && fuelEfficiency > 0)
                System.out.println("Max Distance: " + calculateMaxDistance(maxFuel, fuelEfficiency) + "km");
            else
                System.out.println("Error! Invalid value(s).");

            System.out.print("\nPlease enter the price per litre of petrol: \n>");
            petrolPrice = scanner.nextDouble();

            if (petrolPrice > 0)
                System.out.println("Cost per 100km: " + calculateCostPerOneHundredKM(petrolPrice, fuelEfficiency));
            else
                System.out.println("Error! Invalid value(s).");

        } catch (Exception e) {
            System.out.println("Error! Invalid value(s).");
            e.printStackTrace();
        }
    }

    private static double calculateMaxDistance(double maxFuel, double fuelEfficiency) {
        return maxFuel * fuelEfficiency;
    }

    private static double calculateCostPerOneHundredKM(double petrolPrice, double fuelEfficiency) {
        return (100 / fuelEfficiency) * petrolPrice;
    }
}
