package Aug.B19082024.Generics;

public class MaxThreeNumbers {
    public static <DT extends Comparable<DT>>DT maximumOf(DT a,DT b,DT c){
        //DT Custom Class Created
        DT max= a;
        if(b.compareTo(max)>0){
            max =b;
        }
        if(c.compareTo(max)>0){
            max =c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34,56,78));
        System.out.println(maximumOf(3.4,5.6,5.6));
        System.out.println(maximumOf('a','s','d'));
    }
}
