class Solution {
    public int firstUniqChar(String s) {
        char c[]=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();

        for(char i:c){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(c[i])==1){
                return i;
            }
        }return -1;
    }
}