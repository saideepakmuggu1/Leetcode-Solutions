class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i:nums)
        {
            if(!a1.contains(i))
                a1.add(i);
            else if(!a2.contains(i))
                a2.add(i);
            else
                return false;
        }
        return true;
    }
}