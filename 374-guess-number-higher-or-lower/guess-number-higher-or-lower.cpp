class Solution {
public:
    int guessNumber(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            int res = guess(mid);

            if (res == 0) {
                return mid; // Found the pick
            } else if (res < 0) {
                high = mid - 1; // pick is lower than mid
            } else {
                low = mid + 1; // pick is higher than mid
            }
        }

        return -1; // Just in case, though constraints ensure a pick exists
    }
};