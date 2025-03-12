class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        int m=(int)Arrays.stream(nums).distinct().count();
        if(n==m) return false;
        return true;
    }
}