class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        if(n<0) return false;
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return (rev==x);
    }
}