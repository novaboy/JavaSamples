package fundamental.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class LinkListSample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("MReza");
        list.add("Lyanna");
        list.add("Somayeh");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
