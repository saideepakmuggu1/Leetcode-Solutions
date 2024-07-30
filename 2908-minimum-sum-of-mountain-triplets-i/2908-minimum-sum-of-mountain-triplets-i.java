class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = j + 1;
            while (j < n - 1) {
                k = j + 1;  // Reset k for each new j
                while (k < n) {
                    if (nums[i] < nums[j] && nums[j] > nums[k]) {
                        int s = nums[i] + nums[j] + nums[k];
                        mini = Math.min(s, mini);
                    }
                    k++;
                }
                j++;
            }
        }
        
        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}
