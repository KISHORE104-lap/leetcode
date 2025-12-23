class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=s.length();
        int lwi=s.lastIndexOf(" "),count=0;
        for(int i=lwi;i<len-1;i++){
            count++;
        }
        return count;
}
}