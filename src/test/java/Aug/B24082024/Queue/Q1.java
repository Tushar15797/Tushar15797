package Aug.B24082024.Queue;

import java.util.PriorityQueue;

public class Q1 {
    //Not Much Used in Automation
    //First in First Out
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.offer("20");  //used insted of add
        pq.offer("10");
        pq.offer("60");
        pq.offer("50");
        System.out.println(pq);
        System.out.println(pq.peek());  // top
        System.out.println(pq.poll());  //Remove
        System.out.println(pq);
    }
}
