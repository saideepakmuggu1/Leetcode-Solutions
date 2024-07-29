class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> s=new HashSet<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n1;i++)
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        for(int i:nums2)
        {
            if(hm.containsKey(i) && hm.get(i)>0)
                s.add(i);
        }
        int n=s.size();
        int index=0;
        int[] arr=new int[n];
        for(int i:s)
            arr[index++]=i;
        return arr;
    }
    
}