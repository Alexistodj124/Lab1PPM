public class ItemDataJ {
    Object originalValue;
    public ItemDataJ(Object originalValue){
        this.originalValue = originalValue;
    }
    public static void main(String[] args) {

    }
    public String getType() {
        if (this.originalValue instanceof String) {
            return "cadena";
        } else if (this.originalValue instanceof Integer) {
            return "entero";
        } else if (this.originalValue instanceof Boolean) {
            return "booleano";
        } else {
            return null;
        }
    }
    public String getInfo(){
        if (this.originalValue instanceof String) {
            String sv = (String) this.originalValue;
            return ("L"+ sv.length());
        } else if (this.originalValue instanceof Integer) {
            int iv = (Integer) this.originalValue;
            if (iv % 10 == 0) {
                return "M10";
            } else if (iv % 5 == 0) {
                return "M5";
            } else if (iv % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (this.originalValue instanceof Boolean) {
            boolean bv = (Boolean) this.originalValue;
            if (bv) {
                return "Verdadero";
            } else {
                return "Falso";
            }
        } else {
            return null;
        }
    }
}
