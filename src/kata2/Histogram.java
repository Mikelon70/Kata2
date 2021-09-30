package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;

    public Histogram(int[] array) {
        this.data = array;
    }

    public int[] getData() {
        return this.data;
    }

    public Map getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}