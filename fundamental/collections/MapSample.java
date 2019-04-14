package fundamental.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MReza
 */

public class MapSample {

    public void map() {
        Map<String, Integer> items = new HashMap<>();

        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 50);
        items.put("E", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        items.forEach((k, v) -> System.out.println(k + ":" + v));

        items.forEach((k, v) ->
                {
                    if ("E" == k) {
                        System.out.println("Hello " + k);
                    }
                }
        );

    }

    public static void main(String[] args) {
        MapSample m = new MapSample();
        m.map();
    }
}
