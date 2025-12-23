class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.replaceAll(",","");
        String reversed=new StringBuffer(s).reverse().toString();
        return s.equals(reversed);
    }
}