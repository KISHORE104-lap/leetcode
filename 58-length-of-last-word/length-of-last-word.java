class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int res = 0;
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i++){
            res = arr[i].length();
            break;    
        }
        return res;
    }
}