class Solution {
    public int countDigits(int num) {
        int digits=0;
        int original=num;
        while(num!=0){
           int count= num%10;
            if(original%count==0){
                digits++;
            }
            num/=10;
           
        }
         return digits;
    }
}