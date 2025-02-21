class Solution 
{
    public void rotate(int[] nums, int k) 
    {
         int t = k % nums.length;
         reverse(nums,0,nums.length-1);
         reverse(nums,0,t-1);
         reverse(nums,t,nums.length-1);
         
    }
    public static int[] reverse(int[] nums,int i,int k)
    {
           int left=i;
           int right=k;
           int temp=0;
           while(left < right )
           {
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;       
          }
          return nums;
    }
}