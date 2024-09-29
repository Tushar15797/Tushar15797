package July.A27072024;

public class Lab7 {
    public static void main(String[] args) {
        //lab147
        //Find the max in the Array
        // Find the Max Sal in the Salary Array
        int[] salaries={7,10,4,13,25,11,17};

        int max=1;
        int min =salaries[0];

        for(int i=0; i<salaries.length; i++){
            if(salaries[i]>max){
                max=salaries[i];
            }
            if(min > salaries[i]){
                min =salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}