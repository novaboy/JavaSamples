package fundamental.collections.list;

import java.util.ArrayList;
import java.util.List;


public class ListSample {
    public void list() {
        List<String> items = new ArrayList<>();

        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for (String entry:items){
            System.out.println(entry);
        }

        items.forEach(item -> System.out.println(item));

        items.forEach(System.out::println);

        items.forEach(item ->
                {
                    if ("E"==item){
                        System.out.println("Hello "+item);
                    }
                }
        );

        //Stream and filter
        items.stream()
                .filter(s->s.contains("E"))
                .forEach(System.out::println);

        items.remove("E");

        items.forEach(item -> System.out.println(items.indexOf(item)+"-"+item));


    }


}
