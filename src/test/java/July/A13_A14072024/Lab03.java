package July.A13_A14072024;

public class Lab03 {
    public static void main(String[] args) {
        //Uniary Operatar
//        int age= +65;
//        int car= -1;
//        System.out.println(age);
//        System.out.println(car);

        //Arithmetic Operator  -- > Binary Operator
//        int a=10;
//        int b=20;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a*b);
//
        //Ternary Operator
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b; // max will be 20 since a is not greater than b
        System.out.println(max);

        //Compound Operator
        int a1=10;
          a1+=10; // a1= a1 + 10
//        a1-=10; // a1= a1 - 10
//        a1/=10; // a1= a1 / 10
//        a1*=10; // a1= a1 * 10
        System.out.println(a1);
        //Relational Operator -> Boolean
        //    >,<,<=,>=,!= (!=) - true or false
//        int x= 10;
//        int y= 20;
//        int sum = x+y ;  // operand x,y , operator =,+
//
        int age_pooja=26;
        int age_Tushar=27;
        boolean result =age_Tushar >= age_pooja;
        System.out.println(result);
    }
}
