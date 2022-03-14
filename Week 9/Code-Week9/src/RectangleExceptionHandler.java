public class RectangleExceptionHandler extends Exception {
    private final String message;

    public RectangleExceptionHandler(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
