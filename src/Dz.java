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

    public static Map<String, Integer> changeValue() {
        Map<String, Integer> map1 = new HashMap<>();
        Integer sum = 0;
        for (Map.Entry<String, List<Integer>> map : map.entrySet()) {
            var value = map.getValue();
            for (int i = 0; i < value.size(); i++) {
                sum = sum + value.get(i);
            }
            map1.put(map.getKey(), sum);
            sum = 0;
        }
        return map1;
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
        Map<String, Integer> map1 = changeValue();
        System.out.println(map1);




    }
}
