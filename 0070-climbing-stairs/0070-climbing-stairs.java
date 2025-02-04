class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        return dp(n,memo);
    }
    public int dp(int n,HashMap<Integer,Integer> memo){
        if(n==0||n==1) return 1;
        if(!memo.containsKey(n)){
            memo.put(n,dp(n-1,memo)+dp(n-2,memo));
        }
        return memo.get(n);
    }
}