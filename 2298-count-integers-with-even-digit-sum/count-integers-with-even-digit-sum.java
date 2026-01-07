class Solution {
    public int countEven(int num) {
       int sum = 0, x = num;
       while(x>0){
        sum+=x%10;
        x/=10;
       }
       return (num-(sum%2))/2;
       
}

}