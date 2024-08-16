package B04082024.Access_Modifiers.Private;

public class Police {
    private int gun;
    private String idCard;
    public Police(int gun){
        this.gun=gun;
    }
     private void canIShoot(){
        System.out.println("Yes, You can !!");
    }
}
