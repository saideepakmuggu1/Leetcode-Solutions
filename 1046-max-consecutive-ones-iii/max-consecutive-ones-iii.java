class Solution {
    public int longestOnes(int[] nums, int k) {
          int n = nums.length;
          int cnt = 0;
          int left=0;
          int right=0;
          int mlen = 0;
          while( right<n) {
            if( (nums[right] == 0 && cnt<=k)) cnt++;
            if(cnt > k)
            {
                while(nums[left]!=0) left++;   
                cnt = cnt-1;
                left++;
            }
            mlen = Math.max(mlen,right-left+1);
            right++;
          }
          return mlen;
    }
} 