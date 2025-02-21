class Solution {
    public int firstMissingPositive(int[] nums) 
    {
      
      /*   Arrays.sort(nums);
            int x=1;
            for(int num:nums)
            {
              if(num == x)
                x++;
            }
            return x;    */

     Set<Integer> hash = new HashSet<>();
     for(int n:nums)
      {
        if(n>0)
          hash.add(n);
      }
      int x=1;  
      while(hash.contains(x))
      {
        x++;
      }
      return x;
      
    }
}