import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "груша",
                "яблоко", "арбуз", "апельсин", "виноград", "яблоко",
                "груша", "виноград", "арбуз", "киви", "ананас"
        };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        System.out.print("Unique words: ");
        System.out.println(set);


        //     <key:  value>
        //     <word: how many times met>
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            // if key already exists, we just get the value by current key and increment by 1
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else { // if the key met first time, we initilize its value 1.
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}