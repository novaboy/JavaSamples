package fundamental.collections;

import java.util.*;

public class HashTableSample {

    Map<Integer,String> classmap = new Hashtable<Integer, String>();

    HashTableSample() {



        classmap.put(100,"MReza");
        classmap.put(200,"Lyanna");
        classmap.put(300,"Somaye");
        classmap.put(400,"Ali");


        for (Map.Entry m : classmap.entrySet()){
            System.out.println("Key:"+ m.getKey() +" , value:"+ m.getValue());
        }
        //hm.forEach((k,v) -> System.out.println("Key:"+ k +" , value:"+ v));
    }

    public String keyLookup(Integer i){
        String value;
        value = classmap.getOrDefault(i,"Not Found");
        return value;
    }

    public void add(Integer i, String str){
        System.out.println(classmap.containsKey(i)?"Exist":"Not Exist");
        classmap.putIfAbsent(i,str);
    }

    public static void main(String[] args) {
        HashTableSample hs = new HashTableSample();
        System.out.println(hs.keyLookup(100));
        hs.classmap.remove(100);
        System.out.println(hs.keyLookup(100));
        System.out.println(hs.classmap);
        hs.add(500,"MReza");
        System.out.println(hs.classmap);
        hs.add(500,"MReza");
        System.out.println(hs.classmap);
    }
}
