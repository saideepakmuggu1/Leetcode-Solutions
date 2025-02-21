class Solution {
    public int[] topKFrequent(int[] nums, int k)
     {
          int[] arr =new int[k];
          Map<Integer,Integer> hm = new HashMap<>();
          List<Integer>[] result = new List[nums.length + 1];
          for(int i=0;i<=nums.length;i++)
          {
             result[i] = new ArrayList<>();
          }
          int n = nums.length;
          int large = 0;
          for(int i=0;i<n;i++)
          {
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
          }

          for(Map.Entry<Integer,Integer> map:hm.entrySet())
          {
              int freq = map.getValue();
              int num = map.getKey();
              result[freq].add(num);
          }
          
            int index = 0;

            for (int i = result.length - 1; i >= 0 && index < k; i--) {
                for (int num : result[i]) {
                    arr[index++] = num;
                    if (index == k) break;
                }
            }

          return arr;
     }
          
}