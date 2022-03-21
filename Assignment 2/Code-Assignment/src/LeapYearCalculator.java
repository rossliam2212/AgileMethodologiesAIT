public class LeapYearCalculator {

    public boolean isLeapYear(int year) throws LeapYearExceptionHandler {
        if (year < 1582 || year > 10000) throw new LeapYearExceptionHandler("Invalid Year");

        if (year % 100 == 0) return false;
        else if (year % 4 == 0) return true;
        else return true;
    }
}

// Min Int -> 1581  |  1582 -> 10,000  |  10,001 -> Max Int
// Invalid             Valid              Invalid

// Valid:
// If divisible by 100 => Not Leap
// If divisible by 4 & 400 => Leap