class Solution {
    public static int reverse(int x) {
        int actNum=x;
        long X=(long)(Math.abs((long)x));
        System.out.println(X);
        int digits=noOfDigits(X);
        int remainder;
        long sum=0;
        for(int i=digits-1;i>=0;i--){
            remainder=(int)(X%10);
            sum+=(long)(remainder*Math.pow(10,i));
            X=X/10;
        }
        if(actNum<0 && ~(sum-1)>=-2147483648)
        {
            System.out.println((long)sum);
            return (int)~(sum-1);
        }
        else if(actNum>0&&sum<=2147483647)
            return (int)sum;
        else
            return 0;
    }
    public static int noOfDigits(long n){
        int count=0;
        while(n/10>0){
            count++;
            n=n/10;
        }
        count++;
        return count;
    }
    
}