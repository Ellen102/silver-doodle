import java.util.List;

public class CalcAvrgPrc {
   public static double calculateAveragePrice(List<Double> prices, List<Long> timesInSeconds) {
        if (prices == null || timesInSeconds == null || prices.size() != timesInSeconds.size()) {
            return -1; // Invalid input
        }

        double totalPrice = 0;
        int count = 0;

        for (int i = 0; i < prices.size(); i++) {
            if (timesInSeconds.get(i) > 5 * 3600) { // Convert hours to seconds
                totalPrice += prices.get(i);
                count++;
            }
        }

        if (count == 0) {
            return 0; // No items in the basket for more than 5 hours
        }

        return totalPrice / count;
    }
}
