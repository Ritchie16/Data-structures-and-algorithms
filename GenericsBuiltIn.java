import java.util.*;

public class GenericsBuiltIn {
    public static void main(String[] args) {
        //using List generic
        List<Integer> numbers= new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer each : numbers) {
            System.out.println(each);
        }

        System.out.println("\n\n");

        //using HashMap
        HashMap<String, Integer> pairs = new HashMap<>();
        pairs.put("john", 16);
        pairs.put("mary", 15);


        System.out.println(pairs.get("john"));
        System.out.println(pairs.get("mary"));
    }
}
