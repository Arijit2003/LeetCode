import java.lang.Math;
class Solution {
    public int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
    public int romanToInt(String s) {
        int total=0;
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++){
            s1=value(s.charAt(i));
            if(i+1<s.length()){
                s2=value(s.charAt(i+1));
                if(s1>=s2){
                    total+=s1;
                }else{
                    total-=s1;
                }
            }else{
                total+=s1;
            }
        }
        return total;
    }
}
    
