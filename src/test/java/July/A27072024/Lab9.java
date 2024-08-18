package July.A27072024;

public class Lab9 {
    public static void main(String[] args) {
        int[][] array_2d={
                {32,12,37},
                {12,89,55},
                {01,07,90}
        };

        //lenght array_2d ==9
        for (int i=0; i<array_2d.length;i++){
            for(int j=0; j< array_2d.length; j++){
                System.out.print(array_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
