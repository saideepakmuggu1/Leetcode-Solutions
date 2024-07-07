import java.util.*;
class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        ReverseArray(nums,0,n-1);
        ReverseArray(nums,0,k-1);
        ReverseArray(nums,k,n-1);
      

    }
    public static int[] ReverseArray(int nums[],int start,int end)
    {
        
        while (start < end) 
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}