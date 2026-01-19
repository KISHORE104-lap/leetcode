import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        // Step 1: Find the maximum candies any kid currently has
        for (int c : candies) {
            max = Math.max(max, c);
        }

        // Step 2: Check each kid
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }

        return result;
    }
}
