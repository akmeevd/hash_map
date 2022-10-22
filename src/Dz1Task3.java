import java.util.HashMap;

public class Dz1Task3 {
    public static void addStr(String string, Integer integer) {
        if (str.containsKey(string) && str.values().contains(integer)) {
            throw new RuntimeException("Такие ключ и значение уже есть");
        } else if (!str.containsKey(string)) {
            str.put(string, integer);
        } else if (str.containsKey(string) && !str.values().equals(integer))
            for (int i = 0; i < str.size(); i++) {
                if (str.containsKey(string) && !str.values().equals(integer)) {
                    str.remove(str.get(i));
                    str.put(string, integer);
                }
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

