public class ItemDataJ {
    private Object originalValue;
    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;

    }
    //Funcion getType
    public String getType() {
        if (originalValue instanceof String) {
            return "cadena";
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Boolean) {
            return "booleano";
        } else {
            return null;
        }
    }
    //Funcion getInfo
    public String getInfo() {
        if (originalValue instanceof String) {
            String stringValue = (String) originalValue;
            return "L" + stringValue.length();
        } else if (originalValue instanceof Integer) {
            int intValue = (Integer) originalValue;
            if (intValue % 10 == 0) {
                return "M10";
            } else if (intValue % 5 == 0) {
                return "M5";
            } else if (intValue % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (originalValue instanceof Boolean) {
            boolean boolValue = (Boolean) originalValue;
            if (boolValue) {
                return "Verdadero";
            } else {
                return "Falso";
            }
        } else {
            return null;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Object stringValue = "Hola";
            Object integerValue = 17;
            Object booleanValue = true;
            Object otherValue = new Object();

            ItemDataJ item1 = new ItemDataJ(stringValue);
            ItemDataJ item2 = new ItemDataJ(integerValue);
            ItemDataJ item3 = new ItemDataJ(booleanValue);
            ItemDataJ item4 = new ItemDataJ(otherValue);

            System.out.println(item1.getType()); // Cadena
            System.out.println(item2.getType()); // Entero
            System.out.println(item3.getType()); // Booleano
            System.out.println(item4.getType()); // Null

            System.out.println(item1.getInfo()); // L4
            System.out.println(item2.getInfo()); // M10
            System.out.println(item3.getInfo()); // Verdadero
            System.out.println(item4.getInfo()); // null
        }
    }
}
