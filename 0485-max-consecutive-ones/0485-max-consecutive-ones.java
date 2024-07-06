import java.util.Scanner;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, c = 0;
        for (int x : nums)
            if (x == 1) {
                c++;
                if (max < c)
                    max = c;
            } else
                c = 0;
        return max;

    }
}