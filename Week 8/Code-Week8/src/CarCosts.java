public class CarCosts {

    public double calculateMaxDistance(double maxFuel, double fuelEfficiency) throws CarCostsExceptionHandler {
        if (maxFuel <= 0 || fuelEfficiency <= 0)
            throw new CarCostsExceptionHandler("Invalid values (< 0)");

        return maxFuel * fuelEfficiency;
    }

    public double calculateCostPerOneHundredKM(double petrolPrice, double fuelEfficiency) throws CarCostsExceptionHandler {
        if (petrolPrice <= 0 || fuelEfficiency <= 0)
            throw new CarCostsExceptionHandler("Invalid values (< 0)");

        return (100 / fuelEfficiency) * petrolPrice;
    }
}
