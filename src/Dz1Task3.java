import java.util.HashMap;

public class Dz1Task3 {
    public static void addStr(String string, Integer integer) {
        if (str.containsKey(string) && str.containsValue(integer)) {
            throw new RuntimeException("Такие ключ и значение уже есть");
        }
        if (!str.containsKey(string)) {
            str.put(string, integer);
        }
        if (str.containsKey(string) && !str.containsValue(integer)) {
            str.put(string, integer);
        }
    }

    private static HashMap<String, Integer> str = new HashMap<>();

    public static void main(String[] args) {


        addStr("a", 1);
        addStr("b", 1);
        addStr("a", 2);

        System.out.println(str);
    }

}

