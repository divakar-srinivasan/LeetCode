class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String i:words){
            sb.append(i);
            if(sb.toString().equals(s))
            return true;
        }return false;
    }
}