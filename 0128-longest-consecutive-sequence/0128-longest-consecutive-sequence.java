class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashMap<Integer,Boolean> hmap = new HashMap<>();
        for(int e: nums){
            hmap.put(e,false);
        }
        int count=0,maxcount=0;
        for(int e:hmap.keySet()){
            if(hmap.get(e))continue;
            int v=e;
            while(hmap.containsKey(v-1)) v--;
            count=1;
            hmap.put(v,true);
            while(true){
                if(hmap.containsKey(v+1)){
                    hmap.put(v+1,true);
                    count++;
                    v++;
                }
                else break;
            }
            maxcount=Math.max(maxcount,count); 
        }
        return maxcount;
    }
    public int method1(int[]nums){
        if(nums.length==0)return 0;
        
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        int[]arr=new int[max+1+Math.abs(min)];
        Arrays.fill(arr,-1);
        for(int e:nums){
            arr[e-min]=1;
        }
        System.out.println(Arrays.toString(arr));
        int count=0,maxcount=0;
        for(int i=0;i<=max+Math.abs(min);i++){
            if(arr[i]==-1){
                maxcount=Math.max(maxcount,count);
                count=0;
            }
            else count++;
        }
        maxcount=Math.max(maxcount,count);
        return maxcount;
    }
}