class Solution {
    public String reversePrefix(String s, char c) {
        int n=s.indexOf(c);
        StringBuilder a=new StringBuilder(s.substring(0,n+1));
        return new String(a.reverse().append(s.substring(n+1,s.length())));
    }
}