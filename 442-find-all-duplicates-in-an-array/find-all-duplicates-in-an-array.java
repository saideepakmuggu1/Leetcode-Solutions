class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> hm : map.entrySet())
        {
             if(hm.getValue() > 1)
             {
                 result.add(hm.getKey());
             }
        }
        return result;
    }
}