package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        
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
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
        
    }
    
}
