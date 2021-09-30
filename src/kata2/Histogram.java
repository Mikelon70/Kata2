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
        histogram.put(1, 4);
        histogram.put(6, 2);
        histogram.put(8, 1);
        histogram.put(3, 0);
        histogram.put(7, 9);
        histogram.put(13, 11);
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
