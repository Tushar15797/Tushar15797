package Aug.B24082024.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(52);
        q.offer(24);
        q.offer(36);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

        System.out.println("---------------------------");

        Queue<Integer> q1=new ArrayDeque<>();
        q1.offer(100);
        q1.offer(50);
        q1.offer(60);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

    }
}
