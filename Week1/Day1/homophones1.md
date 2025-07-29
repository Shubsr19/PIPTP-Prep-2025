/*Homophone Sort Challenge (Custom Sort)
Question1:
You are given a list of homophones. Sort them based on their homophone pair, alphabetically. If they belong to the same pair, sort the words among them.

Input:
["right", "sea", "write", "see", "sun", "son"]

Output:
["sea", "see", "son", "sun", "right", "write"]
*/









import java.util.*;

public class HomophoneSortEasy {

    public static void main(String[] args) {
        // List of words to sort
        List<String> words = Arrays.asList("right", "sea", "write", "see", "sun", "son");

        // Map of homophones (each word mapped to its pair)
        Map<String, String> homophones = new HashMap<>();
        homophones.put("see", "sea");
        homophones.put("sea", "see");
        homophones.put("sun", "son");
        homophones.put("son", "sun");
        homophones.put("write", "right");
        homophones.put("right", "write");

        // Sort the list
        Collections.sort(words, (w1, w2) -> {
            String group1 = getGroupKey(w1, homophones);
            String group2 = getGroupKey(w2, homophones);

            // First sort by group key
            if (!group1.equals(group2)) {
                return group1.compareTo(group2);
            }

            // Then sort alphabetically inside the group
            return w1.compareTo(w2);
        });

        // Print the result
        System.out.println(words);
    }

    // Function to get the group key (alphabetically smaller between word and its homophone)
    private static String getGroupKey(String word, Map<String, String> map) {
        String pair = map.get(word);
        if (pair == null) {
            return word; // No homophone
        }
        return word.compareTo(pair) < 0 ? word : pair;
    }
}



/*OUTPUT
 [sea, see, son, sun, right, write]

 */
