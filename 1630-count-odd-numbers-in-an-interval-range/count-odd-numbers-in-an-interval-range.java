class Solution {
    public int countOdds(int low, int high) {

        // If both low and high are odd, add 1
        if (low % 2 == 1 || high % 2 == 1) {
            return (high - low) / 2 + 1;
        } else {
            return (high - low) / 2;
        }
    }
}
