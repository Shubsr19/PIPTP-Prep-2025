/*Homophone Replacer Game
Question 2:
Ask the user to input a sentence. Replace all known homophones with their pair and return the result.
Example: "I see the sun" → "I sea the son" 
*/

import java.util.*;

public class EasyHomophoneReplacer {
    public static void main(String[] args) {
        // Step 1: Define known homophones
        Map<String, String> homophones = new HashMap<>();
        homophones.put("see", "sea");
        homophones.put("sun", "son");
        homophones.put("son", "sun");
        homophones.put("write", "right");
        homophones.put("right", "write");
        homophones.put("no", "know");
        homophones.put("know", "no");

        // Step 2: Get sentence from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().toLowerCase(); // Convert to lowercase

        // Step 3: Replace words
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (String word : words) {
            // Replace if homophone exists
            if (homophones.containsKey(word)) {
                newSentence.append(homophones.get(word));
            } else {
                newSentence.append(word);
            }
            newSentence.append(" ");
        }

        // Step 4: Print result
        System.out.println("Replaced Sentence:");
        System.out.println(newSentence.toString().trim());

        sc.close();
    }
}


/*
Input:
I see the sun and I know the right answer

Output:
I sea the son and I no the write answer
 */