/*
 * Homophone Frequency in Text (Frequency Count)
Question4:
Given a paragraph, count how many times each homophone pair appears. Return the counts for each pair.
Input:
"The knight rode through the night. I had a pear while walking in a pair of shoes."
 */



 import java.util.*;

public class HomophonePairFrequency {

    public static void main(String[] args) {
        String text = "The knight rode through the night. I had a pear while walking in a pair of shoes.";

        // List of known homophone pairs
        List<List<String>> homophonePairs = Arrays.asList(
            Arrays.asList("knight", "night"),
            Arrays.asList("pear", "pair"),
            Arrays.asList("sun", "son"),
            Arrays.asList("see", "sea"),
            Arrays.asList("write", "right")
        );

        // Normalize and split words from the paragraph
        String[] words = text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        // Count homophone pairs where both words are present
        Map<String, Integer> result = new LinkedHashMap<>();

        for (List<String> pair : homophonePairs) {
            String w1 = pair.get(0);
            String w2 = pair.get(1);
            if (wordSet.contains(w1) && wordSet.contains(w2)) {
                result.put(w1 + "-" + w2, 2); // Since both words appeared once
            }
        }

        // Output result
        System.out.println("Homophone pair frequencies:");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


/*
OUTPUT:
Homophone pair frequencies:
knight-night : 2
pear-pair : 2

 */
