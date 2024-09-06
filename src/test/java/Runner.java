 class Runner {

     private int a = 10;
     int b = 20;

     public int geta() {
         return a;
     }

     public void seta(int a) {
         this.a = a;
     }
 }
    class b {
       public static void main(String[] args) {
           Runner a1=new Runner();
           System.out.println(a1.geta());
           a1.seta(20);
           System.out.println(a1.geta());

    }
    }
