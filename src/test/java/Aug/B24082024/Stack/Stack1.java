package Aug.B24082024.Stack;

import java.util.Stack;

public class Stack1 extends Object {
    public static void main(String[] args) {
        //Stack & Vector class are legacy class    -- First one last Out  --Book of Sets
        Stack s = new Stack();
        s.add(7);
        s.add(8);
        s.push("T");
        s.add("P");
        System.out.println(s);
        System.out.println(s.peek()); // are used to add
        System.out.println(s.pop()); // are used to Remove
        System.out.println(s);
    }
}
