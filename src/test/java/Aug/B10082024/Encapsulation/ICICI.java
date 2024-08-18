package Aug.B10082024.Encapsulation;
//Get & Setter Method
public class ICICI {
    private String name;
    private long bal;

    public ICICI(String name,long bal) {
        this.name=name;
        this.bal=bal;
    }
    public long getBal(boolean isAdmin){
        if(isAdmin){
            return bal;
        }else {
            return 0;
        }
    }
    public void setBal(long bal,boolean isAdmin ){
        if(isAdmin){
            this.bal=bal;
            System.out.println("Allowed");
        }else {
            System.out.println("Not Allowed");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String Name,boolean isAdmin){
        if (isAdmin){
            this.name=name;
            System.out.println("Allowed");
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}
