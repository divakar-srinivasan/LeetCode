class Solution {
    public void nextPermutation(int[] num) {
      int n=num.length;
       int i=n-2;
       while(i>=0 && num[i]>=num[i+1]){
           i--;
       }
       if(i>=0){
       int j=n-1;
       while(num[j]<=num[i]){
           j--;
       }
       swap(num,i,j);
       }
       rev(num,i+1,n-1);
    }
    public void swap(int num[],int i,int j){
        int t=num[i];
        num[i]=num[j];
        num[j]=t;
    }
    public void rev(int num[],int i,int j){
        while(i<j){
            swap(num,i,j);
            i++;j--;
        }
}
}