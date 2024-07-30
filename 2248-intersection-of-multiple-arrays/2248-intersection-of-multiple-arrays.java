class Solution {
    public List<Integer> intersection(int[][] nums) {
         int n = nums.length;
         int m = nums[0].length;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<nums[i].length;j++)
            {
                if(!s.contains(nums[i][j]))
                {
                  s.add(nums[i][j]);
                  hm.put(nums[i][j],hm.getOrDefault(nums[i][j],0)+1);
                }
            }
        }
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getValue()==n)
                arr.add(e.getKey());
        }
        Collections.sort(arr);
        return arr;
        
    }
}