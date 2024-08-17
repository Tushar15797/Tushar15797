package B17082024.enum_;

public class DriverClass {
    public static void main(String[] args) {
        System.out.println("LAB183 --" + Lab183.LOW);
        System.out.println("LAB183 --" + Lab183.MEDIUM);
        System.out.println("LAB183 --" + Lab183.HIGH);

        System.out.println("Colour ---" + Colour.RED);
        System.out.println("Colour ---" + Colour.BLUE );
        System.out.println("Colour ---" + Colour.GREEN.getValue() );
        System.out.println("Colour ---" + Colour.RED.getValue());

        System.out.println("PAGES ---" + PAGES.LOGINPAGE);
        System.out.println("PAGES ---" + PAGES.DASHBOARDPAGE);
        System.out.println("PAGES ---" + PAGES.SUPPORTPAGE);
        System.out.println("PAGES ---" + PAGES.CHATBOATPAGE);

    }
}
