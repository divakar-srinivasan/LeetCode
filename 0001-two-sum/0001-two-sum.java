class Solution {
    public int[] twoSum(int[] num, int t) {
        int a[]=new int[2];
        int n=num.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((num[i]+num[j])==t){
                    a[0]=i;a[1]=j;
                }
            }
        }
        return a;
    }
}