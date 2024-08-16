package B04082024.Access_Modifiers.Default;


//Private --> Within The Class
//Public --> Every Where
//Protected -> Within the Folder
//Default --> Default & Private are same But Difference is if we not Mention then Default
public class Cop {
    int gun;
    String idCard;
    Cop(int gun){
        this.gun=gun;
    }
     void canIShoot(){
        System.out.println("Yes, You can !!");
    }
}
