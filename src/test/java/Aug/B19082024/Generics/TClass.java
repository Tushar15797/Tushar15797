package Aug.B19082024.Generics;

public class TClass {
    public static void main(String[] args) {
        Test<Integer> i = new Test<Integer>(5);
        System.out.println(i.getObject());

        Test<Double> i2 = new Test<Double>(5.45);
        System.out.println(i2.getObject());

        Test<String> i3 = new Test<String>("Tushar");
        System.out.println(i3.getObject());

    }
}

// T replaces With Integer,Double,String
class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}
