import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle testObj = new Rectangle();

    // Equivalence Partitioning
    
    // Test Number: 1
    // Objective: Calculate Area with Valid values
    // Input(s): width = 10, length = 20
    // Expected Output: 200
    @Test
    public void testRectangle001() {
        try {
            var actualResult = testObj.calculateArea(10, 20);
            assertEquals(200, actualResult);
        } catch (RectangleExceptionHandler e) {
            fail("No exception expected.");
        }
    }

    // Test Number: 2
    // Objective: Calculate Area with Invalid values on the lower partition
    // Input(s): width = -10, length = -30
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle002() {
        try {
            var actualResult = testObj.calculateArea(-10, -20);
            fail("Should not reach here.");
        } catch (RectangleExceptionHandler e) {
            assertEquals("Invalid Value(s)", e.getMessage());
        }
    }

    // Test Number: 3
    // Objective: Calculate Area with Invalid values on the higher partition
    // Input(s): width = 1100, length = 1500
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle003() {
        try {
            var actualResult = testObj.calculateArea(1100, 1500);
            fail("Should not reach here");
        } catch (RectangleExceptionHandler e) {
            assertEquals("Invalid Value(s)", e.getMessage());
        }
    }

    // Boundary Value Analysis

    // Test Number: 4
    // Objective: Calculate Area with Invalid values on lower boundary (MinInt)
    // Input(s): width = MinInt, length = MinInt
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle004() {
        try {
            var actualResult = testObj.calculateArea(Integer.MIN_VALUE, Integer.MIN_VALUE);
            fail("Should noy reach here");
        } catch (RectangleExceptionHandler e) {
            assertEquals("Invalid Value(s)", e.getMessage());
        }
    }

    // Test Number: 5
    // Objective: Calculate Area wit Invalid values on lower boundary (0)
    // Input(s): width = 0, length = 0
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle005() {
        try {
            var actualResult = testObj.calculateArea(0, 0);
            fail("Should not reach here.");
        } catch (RectangleExceptionHandler e) {
            assertEquals("Invalid Value(s)", e.getMessage());
        }
    }

    // Test Number: 6
    // Objective: Calculate Area with Invalid values on higher boundary (1001)
    // Input(s): width = 1001, length = 1001
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle006() {
        try {
            var actualResult = testObj.calculateArea(1001, 1001);
            fail("Should not reach here.");
        } catch (RectangleExceptionHandler e) {
            assertEquals("Invalid Value(s)", e.getMessage());
        }
    }

    // Test Number: 7
    // Objective: Calculate Area with Invalid values on higher boundary (MaxInt)
    // Input(s): width = 1001, length = MaxInt
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle007() {
        try {
            var actualResult = testObj.calculateArea(Integer.MAX_VALUE, Integer.MAX_VALUE);
            fail("Should not reach here.");
        } catch (RectangleExceptionHandler e) {
            assertEquals("Invalid Value(s)", e.getMessage());
        }
    }

    // Test Number: 8
    // Objective: Calculate Area with Valid Values (1)
    // Input(s): width = 1, length = 1
    // Expected Output: Exception thrown with error message "Invalid Value(s)"
    @Test
    public void testRectangle008() {
        try {
            var actualResult = testObj.calculateArea(1, 1);
            assertEquals(1, actualResult);
        } catch (RectangleExceptionHandler e) {
            fail("No exception expected.");
        }
    }

    // Test Number: 9
    // Objective: Calculate Area with Valid Values (1000)
    // Input(s): width = 1000, length = 1000
    // Expected Output: 1000000
    @Test
    public void testRectangle009() {
        try {
            var actualResult = testObj.calculateArea(1000, 1000);
            assertEquals(1000000, actualResult);
        } catch (RectangleExceptionHandler e) {
            fail("No exception expected.");
        }
    }

}