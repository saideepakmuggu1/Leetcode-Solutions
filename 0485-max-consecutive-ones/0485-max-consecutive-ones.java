import java.util.Scanner;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, c = 0;
        int n=nums.length;
        for (int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                c++;
                max=Math.max(max,c);
            }
            else
               c=0;
        }
        return max;

    }
}