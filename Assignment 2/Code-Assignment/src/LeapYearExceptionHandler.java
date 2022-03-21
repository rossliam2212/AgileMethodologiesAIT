public class LeapYearExceptionHandler extends Exception {
    private final String errorMessage;

    public LeapYearExceptionHandler(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() { return errorMessage; }
}
