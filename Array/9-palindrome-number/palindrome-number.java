class Solution {
    public boolean isPalindrome(int x) {
        int c=x;
        int rev=0;
    
        while(c>0){
             
             rev=(rev*10)+(c%10);
             c=c/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}