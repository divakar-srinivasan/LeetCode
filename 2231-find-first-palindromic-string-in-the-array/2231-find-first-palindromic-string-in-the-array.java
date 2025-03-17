class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder sb=new StringBuilder();
        String rev=new String();
        for(String s:words){
            sb.append(s);
            rev=sb.reverse().toString();
            if(s.equals(rev)){
                return s;
            }
            sb.delete(0,sb.length());
        }return "";
    }
}