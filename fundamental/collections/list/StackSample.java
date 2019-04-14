package fundamental.collections.list;

import java.util.Iterator;
import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("MReza");
        stack.push("Lyanna");
        stack.push("Somaye");
        stack.pop();

        Iterator<String> it = stack.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
