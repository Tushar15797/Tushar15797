package A28072024;

public class Lab003 {
    String name;
    String color="Red";
    void walk() {         System.out.println("Walk");
    }

    void talk() {         System.out.println("Talk");
    }

    public static void main(String[] args) {
        Lab003 ref1=null;           // new Object is created ref1 & assign Null Value
        Lab003 ref2= new Lab003(); // New Object is created ref2
        Lab003 ref3 = new Lab003(); // New object is created ref3//

        System.out.println(ref2.name);
        String color1 = ref3.color;
        System.out.println(color1);

        ref3.walk();
        ref2.talk();
    }
}