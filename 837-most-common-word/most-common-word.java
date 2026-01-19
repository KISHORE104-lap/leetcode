import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) bannedSet.add(word.toLowerCase());

        // Split paragraph into words using non-letter characters
        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        Map<String, Integer> countMap = new HashMap<>();
        String result = "";
        int maxCount = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) continue;

            countMap.put(word, countMap.getOrDefault(word, 0) + 1);

            if (countMap.get(word) > maxCount) {
                maxCount = countMap.get(word);
                result = word;
            }
        }

        return result;
    }
}
