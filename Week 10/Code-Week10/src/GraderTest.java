import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    private Grader testObj = new Grader();

    // Test Number: 1
    // Objective: Generate an A grade - With Valid Values
    // Input(s): examMark = 70, courseWorkMark = 20     ---> (overallResult = 90)
    // Expected Output: A
    @Test
    public void testGrader001() {
        try {
            char actualResult = testObj.calculateGrade(70, 25);
            assertEquals('A', actualResult);
        } catch (GraderExceptionHandler e) {
            assertEquals("FM", e.getErrorMessage());
        }
    }

    // Test Number: 2
    // Objective: Generate a B grade - With Valid Values
    // Input(s): examMark = 50, courseWorkMark = 10     ---> (overallResult = 60)
    // Expected Output: B
    @Test
    public void testGrader002() {
        try {
            char actualResult = testObj.calculateGrade(50, 10);
            assertEquals('B', actualResult);
        } catch (GraderExceptionHandler e) {
            assertEquals("FM", e.getErrorMessage());
        }
    }

    // Test Number: 3
    // Objective: Generate an C grade - With Valid Values
    // Input(s): examMark = 20, courseWorkMark = 20     ---> (overallResult = 40)
    // Expected Output: C
    @Test
    public void testGrader003() {
        try {
            char actualResult = testObj.calculateGrade(20, 20);
            assertEquals('C', actualResult);
        } catch (GraderExceptionHandler e) {
            assertEquals("FM", e.getErrorMessage());
        }
    }

    // Test Number: 4
    // Objective: Generate a D grade - With Valid Values
    // Input(s): examMark = 10, courseWorkMark = 15     ---> (overallResult = 25)
    // Expected Output: D
    @Test
    public void testGrader004() {
        try {
            char actualResult = testObj.calculateGrade(10, 15);
            assertEquals('D', actualResult);
        } catch (GraderExceptionHandler e) {
            assertEquals("FM", e.getErrorMessage());
        }
    }

    // Test Number: 5
    // Objective: Generate an A grade - With Invalid values (Higher Range)
    // Input(s): examMark = 80, courseWorkMark = 30     ---> (overallResult = 110)
    // Expected Output: Exception thrown with error message "FM"
    @Test
    public void testGrader005() {
        try {
            char actualResult = testObj.calculateGrade(80, 30);
            assertEquals('A', actualResult);
        } catch (GraderExceptionHandler e) {
            assertEquals("FM", e.getErrorMessage());
        }
    }

    // Test Number: 6
    // Objective: Generate an A grade - With Invalid values (Lower Range)
    // Input(s): examMark = -10, courseWorkMark = -20   ---> (overallResult = -30)
    // Expected Output: Exception thrown with error message "FM"
    @Test
    public void testGrader006() {
        try {
            char actualResult = testObj.calculateGrade(-10, -20);
            assertEquals('A', actualResult);
        } catch (GraderExceptionHandler e) {
            assertEquals("FM", e.getErrorMessage());
        }
    }

}