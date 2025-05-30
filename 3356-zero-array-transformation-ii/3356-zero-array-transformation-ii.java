class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
    //       if(zero(nums))return 0;
    //          int l=0,count=0,r=0;
           
    //        while(r<queries.length){
    //          int li=queries[r][0],ri=queries[r][1],vi=queries[r][2];

    //          for(int i=li;i<=ri;i++){
    //             nums[i]=Math.max(0,nums[i]-vi);
    //          }
    //          if(zero(nums)){
    //             return r+1;
    //          }
    //          r++;
             


    //        }
           
    //        return -1;

    // }
  long sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
        }
        if(sum == 0) return 0;
        int n = nums.length;
        
        int l = 1, r = queries.length;
        int res = -1;

        while(l <= r) {
            int mid = (l+r)/2;
            if(check(nums, queries, mid)) {
                res = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return res;
}
    public Boolean check(int[] nums, int[][] queries, int limit) {

int[] arr = new int[nums.length+1];
        for(int i=0; i<limit; i++) {
            arr[queries[i][0]] -= queries[i][2];
            arr[queries[i][1]+1]+=queries[i][2];
            
        }
        int dec = 0;
        long sum = 0;
        for(int i=0; i<nums.length; i++) {
            dec += arr[i];
            if(nums[i]+dec>0) sum += nums[i];
        }
        return sum==0;

}
}