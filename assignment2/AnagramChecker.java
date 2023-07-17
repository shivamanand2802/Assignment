import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Remove spaces and punctuation, and convert to lowercase
        String cleanedStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Step 2: Check if the lengths of cleaned strings are equal
        if (cleanedStr1.length() != cleanedStr2.length()) {
            return false; }

        // Step 3: Create character frequency maps
        Map < Character, Integer > frequencyMap1 = createFrequencyMap(cleanedStr1);
        Map < Character, Integer > frequencyMap2 = createFrequencyMap(cleanedStr2);

        // Step 4: Compare frequency maps
        return frequencyMap1.equals(frequencyMap2); }

    private static Map < Character, Integer > createFrequencyMap(String str) {
        Map < Character, Integer > frequencyMap = new HashMap <> ();
        for (char ch: str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1); }
        return frequencyMap; }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams."); } 
        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams."); }
    }
}
