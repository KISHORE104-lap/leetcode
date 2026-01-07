class Solution {
    public int findComplement(int num) {

        int mask = 0;
        int temp = num;

        // Create mask with all bits = 1 (same length as num)
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        // XOR with mask to flip bits
        return num ^ mask;
    }
}
