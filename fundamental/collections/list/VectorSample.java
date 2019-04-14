package fundamental.collections.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorSample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("MReza");
        vector.add("Lyanna");
        vector.add("Somaye");


        Iterator<String> it = vector.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        vector.remove("Lyanna");
        System.out.println(vector);
    }
}
