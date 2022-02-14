import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    Conversion testObj = new Conversion();

    // Test Number: 1
    // Objective: Invalid Values (Lower Range)
    // Input(s): amount = $50, rate = 0.12
    // Expected Output: -1
    @Test
    public void testConvertUSDToEuro001() {
        double actualResult = testObj.convertUSDToEuro(50, 0.12);
        assertEquals(-1, actualResult, 0.01);
    }

    // Test Number: 2
    // Objective: Valid Values
    // Input(s): amount = $750, rate = 0.88
    // Expected Output: €662.21
    @Test
    public void testConvertUSDToEuro002() {
        double actualResult = testObj.convertUSDToEuro(750, 0.88295129);
        assertEquals(662.21, actualResult, 0.01);
    }

    // Test Number: 3
    // Objective: Invalid Values (Higher Range)
    // Input(s): amount = $11750, rate = 1.80
    // Expected Output: -1
    @Test
    public void testConvertUSDToEuro003() {
        double actualResult = testObj.convertUSDToEuro(11750, 1.80);
        assertEquals(-1, actualResult, 0.01);
    }
}