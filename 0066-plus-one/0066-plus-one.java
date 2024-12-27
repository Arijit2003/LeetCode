class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arrLst = new ArrayList<>();
        int carry=1,sum=0;
        for(int i=digits.length-1;i>=0;i--){
            sum=carry+digits[i];
            arrLst.add(0,sum%10);
            carry=sum/10;
        }
        if(carry>0)arrLst.add(0,carry);
        int arr[]=new int[arrLst.size()];
        return arrLst.stream().mapToInt(Integer::intValue).toArray();
    }
}