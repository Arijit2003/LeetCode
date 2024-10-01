class Solution {
    public int countDigits(int n) {
        int act=n,count=0, r=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            if(r!=0 && act%r==0)count++;
        }
        return count;
    }
}