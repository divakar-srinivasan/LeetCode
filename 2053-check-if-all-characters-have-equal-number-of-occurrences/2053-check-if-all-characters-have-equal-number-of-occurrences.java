class Solution {
    public boolean areOccurrencesEqual(String s) {
        char c[]=s.toCharArray();
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char i:c){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set=new HashSet<>(freqMap.values());
        if(set.size()>1) return false;
        return true;
    }
}