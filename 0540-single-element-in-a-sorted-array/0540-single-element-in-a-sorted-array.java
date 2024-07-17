class Solution {
    public int singleNonDuplicate(int[] nums) {
     Map<Integer,Integer> hm=new HashMap<>();
      int n=nums.length;
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getValue()==1)
                return e.getKey();
        }
        return 0;
    }
}