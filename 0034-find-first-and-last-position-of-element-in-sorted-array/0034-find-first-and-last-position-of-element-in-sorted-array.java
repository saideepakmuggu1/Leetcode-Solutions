class Solution {
  

// sarch from beginning
    public int searchindfornt(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
// search from end
    public int searchindend(int[] arr,int target){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;



    }


  public int[] searchRange(int[] nums, int target) {
        int x=searchindfornt(nums,  target);
        int y=searchindend(nums,  target);

        int[] ans={x,y};
        return ans;

    }
    




}