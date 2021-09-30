package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        int[] data = {0, 1, 4, 1, 2, 1, 4, 4, 100, 100, -5, -4, -5, 1};

        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        

        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
        
    }
    
}
