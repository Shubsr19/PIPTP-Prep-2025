/*
 Count Total Vowels in Homophone Words

Question3:
You are given a list of words. Some of these words are homophones.
Write a program to:

Identify homophone pairs from a known list.

Count the total number of vowels (a, e, i, o, u) present in all the homophone words from the list.
 */




import java.util.*;

public class VowelCountInHomophones {

    public static void main(String[] args) {
        // Input list
        List<String> words = Arrays.asList("see", "sun", "apple", "write", "sea", "son");

        // Known homophone pairs
        Set<String> homophones = new HashSet<>(Arrays.asList(
            "see", "sea", "sun", "son", "write", "right"
        ));

        int vowelCount = 0;

        for (String word : words) {
            if (homophones.contains(word)) {
                vowelCount += countVowels(word);
            }
        }

        System.out.println("Number of vowels in homophones = " + vowelCount);
    }

    // Function to count vowels in a word
    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}



/*
 OUTPUT:
 Number of vowels in homophones = 9

 */