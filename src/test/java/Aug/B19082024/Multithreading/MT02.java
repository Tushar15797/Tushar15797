package Aug.B19082024.Multithreading;

public class MT02 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        for (int i=0; i<10; i++){
            System.out.println(t.getName()+i+"--"+t.getPriority()+"--"+t.getThreadGroup());
        }
    }
}
