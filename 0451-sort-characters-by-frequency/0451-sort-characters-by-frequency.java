import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Create a list of characters to sort them based on frequency
        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        
        // Sort the characters based on frequency
        characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        // Build the output string
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            int frequency = frequencyMap.get(c);
            for (int i = 0; i < frequency; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}