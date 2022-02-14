import java.text.DecimalFormat;

public class Conversion {
    private final DecimalFormat df = new DecimalFormat("0.00");

    public double convertUSDToEuro(double amount, double rate) {
        if (amount < 100 || amount > 1000 || rate < 0.5 || rate > 1.6)
            return -1;
        return Double.parseDouble(df.format(amount * rate));
    }
}
