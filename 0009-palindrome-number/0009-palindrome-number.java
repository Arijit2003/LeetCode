import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int reversedNumber=reverse(x);
            if(x==reversedNumber) return true;
            else return false;
        }else{
            return false;
        }
    }
    public int reverse(int number){
        int digits=noOfDigits(number);
        int newNumber=0;
        int remainder=0;
        for(int i=digits-1;i>=0;i--){
            remainder=number%10;
            newNumber+=remainder*((int)Math.pow(10,i));
            number/=10;
        }
        return newNumber;
        
    }
    public int noOfDigits(int n){
        int count=0;
        while(n/10>0){
            count++;
            n=n/10;
        }
        count++;
        return count;
    }

}