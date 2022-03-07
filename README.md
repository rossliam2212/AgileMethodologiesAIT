# Agile Methodologies AIT
All my work from my second year Agile Methodologies module in AIT.

## Quick Links
- [Week 1](#week-1)
- [Week 2](#week-2)
- [Week 3](#week-3)
- [Week 4](#week-4)
- [Week 5](#week-5)
- [Week 6](#week-6)
- [Week 7](#week-7)
- [Week 8](#week-8)
- [Week 9](#week-9)
- [Weel 10](#week-10)

### Week 1
- Introduction.

### Week 2 
[src](https://github.com/rossliam2212/AgileMethodologiesAIT/tree/master/Week%202)

#### Problem 1:
- Write a program that reads two integers together. Print the sum to a console window.

<img width="683" alt="Screenshot 2022-02-14 at 21 18 41" src="https://user-images.githubusercontent.com/73957889/153948033-8a89dfcd-d14d-487e-a113-9b3a01731728.png">

#### Problem 2:
- Write a program that reads and multiplies three integers together. Print the result to a console window.

<img width="691" alt="Screenshot 2022-02-14 at 21 15 45" src="https://user-images.githubusercontent.com/73957889/153947642-fc264d95-0b3a-43c7-b008-d361cb6b48fd.png">

<img width="469" alt="Screenshot 2022-02-14 at 21 09 39" src="https://user-images.githubusercontent.com/73957889/153946944-297bbf0b-2970-40de-9ed7-f366380ac13f.png">


### Week 3
- Assignment work.

### Week 4
[src](https://github.com/rossliam2212/AgileMethodologiesAIT/tree/master/Week%204)

#### Problem:
- Design, implement and test an application that calculates the cost per 100 kilometers of running a car and how far a car can go with a full tank of petrol based on the following information being provided:
1. The number of litres of petrol in the tank.
2. The fuel efficiency in kilometers per litre.
3. The price of petrol per litre.

<img width="683" alt="Screenshot 2022-02-14 at 21 17 17" src="https://user-images.githubusercontent.com/73957889/153947842-04cb2519-bdf2-49d4-8215-90c992603de9.png">

### Week 5
[src](https://github.com/rossliam2212/AgileMethodologiesAIT/tree/master/Week%205/Code-Week5)

#### Problem:
- Write a method that converts US dollar values to Euro values based on the current exchange rate between U.S. dollars and and the Euro. On successful conversion, the Euro amount is returned.

- You are required to:
1. Develop appropriate User Stories,
2. Design a suitable Product Skeleton,
3. Employ Junit TDD process to test and develop the solution.

<img width="691" alt="Screenshot 2022-02-14 at 21 14 30" src="https://user-images.githubusercontent.com/73957889/153947478-6e4c92bf-43d9-42fb-8763-273e34eff938.png">

```java
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
```
### Week 6
- Worked with debugger.

### Week 7
- Reading Week - Worked on Assignment.

### Week 8
[src](https://github.com/rossliam2212/AgileMethodologiesAIT/tree/master/Week%208/Code-Week8)

#### Week 4 Problem Revisted:

Design, implement and test methods that calculates the cost per 100 kilometers of running a car and how far a car can go with a full tank of petrol based on the following information being provided:

1. The number of litres of petrol in the tank.

2. The fuel efficiency in kilometers per litre.

3. The price of petrol per litre.

Use Exception Handling to handle any "error" situations that may arise.

### Week 9
- Worked on case design & coverage.

### Week 10

[src](https://github.com/rossliam2212/AgileMethodologiesAIT/tree/master/Week%2010/Code-Week10)

#### Problem:
Employ Test Driven Development to implement the following specifications/applications. In this practical, you are required to design, implement, and execute your JUnit tests and design & implement the product skeleton. Employ TDD process discussed in class.

Specifications/Applications:

Consider an application, generate_grading, with the following specification:

The application is passed an exam mark (out of 75) and a coursework (c/w) mark (out of 25), from which it generates a grade for the course in the range 'A' to 'D'. The grade is calculated from the overall mark which is calculated as the sum of the exam and c/w marks,as follows:

- greater than or equal to 70 - 'A'
- greater than or equal to 50, but less than 70 - 'B'
- greater than or equal to 30, but less than 50 - 'C'
- less than 30 - 'D'
Where a mark is outside its expected range then an exception is generated with a fault message ('FM') is generated. All inputs are passed as integers.

Design a set of tests that provide 100% Equivalence Partitioning and 100% BVA Coverage.

<img width="685" alt="Screenshot 2022-03-07 at 14 40 00" src="https://user-images.githubusercontent.com/73957889/157055845-9dbd0a9d-25db-42e3-bc29-d11a9548d8ee.png">

```java
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
```

