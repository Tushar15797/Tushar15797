package B04082024.HasA;

public class car {
    //Aggregation - hasA
    public static void main(String[] args) {
        System.out.println("Car");

        // With Help Of Object Creation Without Assign Name
        new engine().start();
        new Tyres().rolling();

        // With Help Of Object Creation With Assign Name
        engine e= new engine();
        e.start();

        Tyres t=new Tyres();
        t.rolling();

    }
}
