class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int e:nums) pq.offer(e);
        for(int i=1;i<k;i++) pq.poll();
        return pq.poll();
    }
}