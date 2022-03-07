public class GraderExceptionHandler extends Exception {

    private final String errorMessage;

    public GraderExceptionHandler(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() { return this.errorMessage; }
}
