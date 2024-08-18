package Aug.B17082024.enum_;

public enum Colour {
    RED("#FF#@$"),
    GREEN("#123%"),
    BLUE("#56()");

         private final String hexValue;
        Colour(String hexValue){
            this.hexValue=hexValue;
        }
        public String getValue(){
            return hexValue;
        }
}
