import java.util.List;

public class CalcAvrgPrc {
    public static double calc(List<Double> prs, List<Long> tm) {
        double sum = 0;
        int ct = 0;

        for (int i = 0; i < prs.size(); i++) {
            if (tm.get(i) > 18000) { // 5 hours in seconds
                sum += prs.get(i);
                ct += 1;
            }
        }

        if (ct == 0) {
            return -1; // No prices found
        } else {
            return sum / ct;
        }
    }
}
