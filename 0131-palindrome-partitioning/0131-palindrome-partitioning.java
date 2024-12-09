class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        fun(s,0,new ArrayList<>(), s.length());
        return res;
    }
    public void fun(String s, int idx,ArrayList<String> temp, int n){
        if(idx==n){
            res.add(new ArrayList<>(temp));
            return ;    
        }
        for(int i=idx;i<n;i++){
            if(isPalindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                fun(s,i+1,temp,n);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int st, int end){
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end))return false;
            st++;
            end--;
        }
        return true;
    }
}