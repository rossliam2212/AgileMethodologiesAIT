public class CarCostsExceptionHandler extends Exception {
    private final String errorMessage;

    public CarCostsExceptionHandler(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMessage() { return this.errorMessage; }
}
