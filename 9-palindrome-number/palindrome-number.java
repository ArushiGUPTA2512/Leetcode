class Solution {
    public boolean isPalindrome(int x) {
        int d,n=x;
        int r=0;
        while(x>0){
            d=x%10;
            r=(r*10)+d;
            x/=10;
           
        }
        /*if(r==n){
        return true;
        }
        else{
            return false;
        }*/
        return r==n;
        

        
    }
}