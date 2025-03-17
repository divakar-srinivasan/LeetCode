class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int t=0;
        for(String i:sentences){
            t=(int)Arrays.stream(i.split("\\s+")).count();
            if(t>count) count=t;
        }
        return count;
    }
}