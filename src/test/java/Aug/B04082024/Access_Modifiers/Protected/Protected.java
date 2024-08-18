package Aug.B04082024.Access_Modifiers.Protected;

public class Protected {
    private int gun;
    private String idCard;

    public Protected(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Yes, You can !!");  // it is accessible in same Package
    }
}
