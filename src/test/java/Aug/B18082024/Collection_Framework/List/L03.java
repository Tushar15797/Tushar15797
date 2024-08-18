package Aug.B18082024.Collection_Framework.List;
import java.util.List;

public class L03 {
    //lab230
    public static void main(String[] args) {
        List shopping_list = List.of("Milk","Butter","PEN","BISCUITE","BOOK");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        shopping_list.add("BANANA");  // Error : ---it is a Immutable Collection
        System.out.println(shopping_list);

    }
}
