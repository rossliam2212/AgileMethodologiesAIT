public class Rectangle {
    public int calculateArea(int width, int length) throws RectangleExceptionHandler {
        if (width < 1 || width > 1000 || length < 1 || length > 1000)
            throw new RectangleExceptionHandler("Invalid Value(s)");

        return length * width;
    }
}
