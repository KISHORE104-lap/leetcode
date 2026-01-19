import java.util.*;

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = indices.length;
        
        // Pair index with its position to sort by index
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> indices[a] - indices[b]); // ascending index
        
        StringBuilder sb = new StringBuilder();
        int i = 0; // pointer in original string
        
        for (int idx = 0; idx < n; idx++) {
            int repIdx = order[idx];
            int index = indices[repIdx];
            
            // Append characters from current pointer to replacement start
            while (i < index) {
                sb.append(s.charAt(i));
                i++;
            }
            
            // Check if source matches
            String source = sources[repIdx];
            if (s.startsWith(source, index)) {
                sb.append(targets[repIdx]);
                i += source.length(); // skip source length
            }
        }
        
        // Append remaining characters
        while (i < s.length()) {
            sb.append(s.charAt(i));
            i++;
        }
        
        return sb.toString();
    }
}
