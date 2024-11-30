class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int i=0;
        for(i=0;i<s.length();i++){
            if(hset.contains(s.charAt(i))) break;
            hset.add(s.charAt(i));
        }
        int maxct=hset.size(),st=0;
        for(;i<s.length();i++){
            while(hset.contains(s.charAt(i))){
                hset.remove(s.charAt(st));
                st++;
            }
            hset.add(s.charAt(i));
            maxct=Math.max(maxct,hset.size());
        }
        return maxct;

    }
}