class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        int[] arr=new int[2];
        int cnt1=0;
        int cnt2=0;
        for(int i:nums1)
            s1.add(i);
        for(int i:nums2)
            s2.add(i);
        for(int i:nums1)
        {
            if(s2.contains(i))
                cnt1++;
        }
        for(int i:nums2)
        {
            if(s1.contains(i))
                cnt2++;
        }
        arr[0]=cnt1;
        arr[1]=cnt2;
        return arr;
        
    }
}