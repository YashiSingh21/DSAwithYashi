class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int sum = helper(n,0);
        
        if(x == sum){
            return true;
        }
        return false;
    }
    public int helper(int n,int sum){
        if(n == 0){
            return sum;
        }
        sum = sum*10 + n % 10;
        return helper(n/10,sum);
    }
}
