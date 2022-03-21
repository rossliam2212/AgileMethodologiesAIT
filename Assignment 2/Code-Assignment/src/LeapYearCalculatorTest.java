import junit.framework.TestCase;

public class LeapYearCalculatorTest extends TestCase {
    private LeapYearCalculator testObj = new LeapYearCalculator();

    // Test Number: 1
    // Objective: Determine whether a year is a leap year or not with an Invalid Year on Lower Range
    // Input(s): year = Min Int
    // Expected Output: Exception thrown with error message "Invalid Year"
    public void testLeapYear001() {
        try {
            boolean actualResult = testObj.isLeapYear(Integer.MIN_VALUE);
            fail("Should not reach here.");
        } catch (LeapYearExceptionHandler e) {
            assertEquals("Invalid Year", e.getErrorMessage());
        }
    }

    // Test Number: 2
    // Objective: Determine whether a year is a leap year or not with an Invalid Year on Lower Range
    // Input(s): year = 1581
    // Expected Output: Exception thrown with error message "Invalid Year"
    public void testLeapYear002() {
        try {
            boolean actualResult = testObj.isLeapYear(1581);
            fail("Should not reach here.");
        } catch (LeapYearExceptionHandler e) {
            assertEquals("Invalid Year", e.getErrorMessage());
        }
    }

    // Test Number: 3
    // Objective: Determine whether a year is a leap year or not with an Invalid Year on Higher Range
    // Input(s): year = 10,001
    // Expected Output: Exception thrown with error message "Invalid Year"
    public void testLeapYear003() {
        try {
            boolean actualResult = testObj.isLeapYear(10001);
            fail("Should not reach here.");
        } catch (LeapYearExceptionHandler e) {
            assertEquals("Invalid Year", e.getErrorMessage());
        }
    }

    // Test Number: 4
    // Objective: Determine whether a year is a leap year or not with an Invalid Year on Higher Range
    // Input(s): year = Max Int
    // Expected Output: Exception thrown with error message "Invalid Year"
    public void testLeapYear004() {
        try {
            boolean actualResult = testObj.isLeapYear(Integer.MAX_VALUE);
            fail("Should not reach here.");
        } catch (LeapYearExceptionHandler e) {
            assertEquals("Invalid Year", e.getErrorMessage());
        }
    }

    // Test Number: 5
    // Objective: Determine whether a year is a leap year or not with a Valid Year divisible by 100
    // Input(s): 1900
    // Expected Output: false
    public void testLeapYear005() {
        try {
            boolean actualResult = testObj.isLeapYear(1900);
            assertFalse(actualResult);
        } catch (LeapYearExceptionHandler e) {
            fail("No exception should be thrown");
        }
    }

    // Test Number: 6
    // Objective: Determine whether a year is a leap year or not with a Valid Year divisible by 4
    // Input(s): 1980
    // Expected Output: false
    public void testLeapYear006() {
        try {
            boolean actualResult = testObj.isLeapYear(1980);
            assertFalse(actualResult);
        } catch (LeapYearExceptionHandler e) {
            fail("No exception should be thrown");
        }
    }

    // Test Number: 7
    // Objective: Determine whether a year is a leap year or not with a Valid Year divisible by 400
    // Input(s): 2000
    // Expected Output: true
    public void testLeapYear007() {
        try {
            boolean actualResult = testObj.isLeapYear(2000);
            assertTrue(actualResult);
        } catch (LeapYearExceptionHandler e) {
            fail("No exception should be thrown");
        }
    }
}