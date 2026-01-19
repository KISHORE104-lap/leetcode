class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        long[] dp = new long[n];
        dp[0] = 1;

        int[] index = new int[k];

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

            // Find next super ugly number
            for (int j = 0; j < k; j++) {
                min = Math.min(min, dp[index[j]] * primes[j]);
            }

            dp[i] = min;

            // Increment all indices that match min
            for (int j = 0; j < k; j++) {
                if (dp[index[j]] * primes[j] == min) {
                    index[j]++;
                }
            }
        }

        return (int) dp[n - 1];
    }
}
