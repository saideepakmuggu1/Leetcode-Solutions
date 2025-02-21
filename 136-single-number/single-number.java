class Solution {
    public int singleNumber(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> h : map.entrySet())
        {
            if(h.getValue() == 1)
            {
                return h.getKey();
            }
        }
        return -1;
    }
}