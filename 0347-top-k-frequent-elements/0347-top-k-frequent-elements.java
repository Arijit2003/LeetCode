class Solution {
    static class Pair{
        int element, freq;
        Pair(int element, int freq){
            this.element=element;
            this.freq=freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int e:nums)hmap.put(e,hmap.getOrDefault(e,0)+1);
        PriorityQueue<Pair> pq=  new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        int[]res=new int[k];
        for(int i=1;i<=k;i++)res[i-1]=pq.poll().element;
        return res;
    }
}