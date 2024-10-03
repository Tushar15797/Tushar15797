
public class Test {
    //Encapsulation
     private int id = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Tushar";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
    class a{
    public static void main(String[] args) {
       Test a1=new Test();
        System.out.println(a1.getId());
        a1.setName("Patil");
        System.out.println(a1.getName());
    }
}