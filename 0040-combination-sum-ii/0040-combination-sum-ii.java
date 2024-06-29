class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        helper(0,target,arr,ans,ds);
        return ans;
    }
    public void helper(int id,int target,int arr[],List<List<Integer>> ans,List<Integer> ds)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
        }
        for(int i=id;i<arr.length;i++)
        {
            if(i>id && arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]>target)
            {
                break;
            }
            ds.add(arr[i]);
            helper(i+1,target-arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}