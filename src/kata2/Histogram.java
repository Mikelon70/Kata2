package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;

    public Histogram(T[] array) {
        this.data = array;
    }

    public T[] getData() {
        return this.data;
    }

    public Map getHistogram() {
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}