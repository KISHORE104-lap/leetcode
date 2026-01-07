class Solution {
    public int bitwiseComplement(int n) {
     
        int mask = 0;
        int temp = n;
        if(n==0)return 1;
        // Create mask with all bits = 1 (same length as num)
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        // XOR with mask to flip bits
        return n ^ mask;
    }
}