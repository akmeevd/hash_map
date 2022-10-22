import java.util.*;

public class Dz {
    //ДЗ 2 задание 1

    private static Map<String, List<Integer>> map = new HashMap<>();

    public static void addInMap(String string) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Integer number = random.nextInt(1000);
            integers.add(number);
        }
        map.put(string, integers);

    }

    public static void changeValue() {
        List<Integer> a = new ArrayList<>();
        Integer sum = 0;
        for (Map.Entry<String, List<Integer>> map : map.entrySet()) {
            for (int i = 0; i < map.getValue().size(); i++) {
                sum = sum + map.getValue().get(i);
            }
            map.getValue().removeAll(map.getValue());
            map.getValue().add(sum);
            sum = 0;
        }
    }

    public String toString() {
        return "Dz{" +
                "map=" + map +
                '}';
    }

    public static void main(String[] args) {
        addInMap("some");
        addInMap("some2");
        addInMap("some3");
        addInMap("some4");
        addInMap("some5");
        System.out.println(map);
        changeValue();
        System.out.println(map);


    }
}
