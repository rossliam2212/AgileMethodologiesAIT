import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarCostsTest {
    CarCosts textObj = new CarCosts();

    // Test Number: 1
    // Objective: Calculate Max Distance - Valid Values
    // Input(s): maxFuel = 50, fuelEfficiency = 17
    // Expected Output : 850
    @Test
    public void testCarCosts001() {
        try {
            double actualResult = textObj.calculateMaxDistance(50, 17);
            assertEquals(850, actualResult);
        } catch (CarCostsExceptionHandler e) {
            assertEquals("Invalid values (< 0)", e.getMessage());
        }
    }

    // Test Number: 2
    // Objective: Calculate Max Distance - Invalid Values
    // Input(s): maxFuel = -10, fuelEfficiency = -2
    // Expected Output: Exception thrown with "Invalid values (< 0)"
    @Test
    public void testCarCosts002() {
        try {
            double actualResult = textObj.calculateMaxDistance(-10, -2);
            fail("Exception expected...");
        } catch (CarCostsExceptionHandler e) {
            assertEquals("Invalid values (< 0)", e.getMessage());
        }
    }

    // Test Number: 3
    // Objective: Calculate Cost Per 100km - Valid Values
    // Input(s): petrolPrice = 1.6, fuelEfficiency = 15
    // Expected Output: 10.6
    @Test
    public void testCarCosts003() {
        try {
            double actualResult = textObj.calculateCostPerOneHundredKM(1.6, 15);
            assertEquals(10.66, actualResult, 0.01);
        } catch (CarCostsExceptionHandler e) {
            assertEquals("Invalid values (< 0)", e.getMessage());
        }
    }

    // Test Number: 4
    // Objective: Calculate Cost Per 100km - Invalid Values
    // Input(s): petrolPrice = -0.5 , fuelEfficiency = -25
    // Expected Output: Exception thrown with "Invalid values (< 0)"
    @Test
    public void testCarCosts004() {
        try {
            double actualResult = textObj.calculateCostPerOneHundredKM(-0.5, -25);
            fail("Exception expected...");
        } catch (CarCostsExceptionHandler e) {
            assertEquals("Invalid values (< 0)", e.getMessage());
        }
    }
}