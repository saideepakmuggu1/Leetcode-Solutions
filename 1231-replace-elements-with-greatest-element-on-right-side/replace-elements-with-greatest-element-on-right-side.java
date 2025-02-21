class Solution
 {
    public int[] replaceElements(int[] arr)
     {
        int[] result = new int[arr.length];
        int n = arr.length;
        int large = Integer.MIN_VALUE;
        int mlarge = 0;
        int j = n-1;
        for(int i=n-1;i>=0;i--)
        {
             int temp = arr[i]; 
             result[i] = mlarge;
             mlarge = Math.max(mlarge, temp); 
         }
           result[n-1]  = -1;
       
        
                return result;
    }
}