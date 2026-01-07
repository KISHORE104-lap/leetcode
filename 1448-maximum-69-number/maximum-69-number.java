class Solution {
    public int maximum69Number(int num) {

        String str = Integer.toString(num);

        char[] digits = str.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; // only first 6
            }
        }

        return Integer.parseInt(new String(digits));
    }
}
