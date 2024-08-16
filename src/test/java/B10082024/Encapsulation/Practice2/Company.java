package B10082024.Encapsulation.Practice2;

class A{
    private int sal=3000;
    String name= "tushar";
    public int getSal(){
        return sal;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
}


class Company{
    public static void main(String[] args) {
        A ref= new A();
        System.out.println(ref.getSal());
        ref.setSal(5000);
        System.out.println(ref.getSal());
    }
}