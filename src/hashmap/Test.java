package hashmap;

/**
 *
 * @author Tobias
 */
public class Test {

    public static void main(String[] args) {
        Map<String, Integer> myM = new HashMap<>();

        for (int i = 0; i < 10; i += 2) {
            String s = "#" + i;
            myM.put(s, i);
        }

        System.out.println("Size: " + myM.size());
        for (int i = 0; i < 10; ++i) {
            String s = "#" + i;
            Integer value = myM.get(s);
            System.out.println("Key: " + s + " Value: " + value);
        }

        System.out.println(myM.remove("#8"));

        System.out.println("Size: " + myM.size());
        for (int i = 0; i < 10; ++i) {
            String s = "#" + i;
            Integer value = myM.get(s);
            System.out.println("Key: " + s + " Value: " + value);
        }

        System.out.println("--------------------------------------------------");

        Map<String, Integer> myMap = new HashMapLink<>();

        for (int i = 0; i < 1000; i += 2) {
            String s = "#" + i;
            myMap.put(s, i);
        }
        myMap.put("test", 1);
        myMap.put("test2", 2);

        System.out.println("Size: " + myMap.size());

        myMap.remove("test");

        System.out.println("Size: " + myMap.size());
        for (int i = 0; i < 1000; ++i) {
            String s = "#" + i;
            Integer value = myMap.get(s);
            System.out.println("Key: " + s + " Value: " + value);
        }
    }
}
