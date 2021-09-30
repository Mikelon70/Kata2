package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        int[] data = {0, 1, 4, 1, 2, 1, 4, 4, 100, 100, -5, -4, -5, 1};

        Histogram histo = new Histogram(data);

        Map<Integer,Integer> histogr = histo.getHistogram();
        

        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
        
    }
    
}
