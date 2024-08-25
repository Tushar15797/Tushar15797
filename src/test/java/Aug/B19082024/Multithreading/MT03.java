package Aug.B19082024.Multithreading;

public class MT03 {
    public static void main(String[] args) {
        //Task 1 go from 1 to 5
        Worker1MT03 W1= new Worker1MT03();
        W1.start();
        Worker1MT03 W2= new Worker1MT03();
        W2.start();
        //Task 2 go from 1 to 100

    }
}
//Thread by class
class Worker1MT03 extends Thread{
    @Override
    public void run() {
     for(int i=0; i<5; i++){
         try{
             System.out.println(Thread.currentThread().getName());
         }catch (Exception e){
             e.printStackTrace();
         }
     }
    }
}

