// class Solution {
//     public int minOperations(int[] nums) {

// //  int count=0;

// //         for(int i:nums){
// //             if(i==1)count++;

// //         }
// //         if(count>0)return nums.length-count;

// //         for(int i=0;i<nums.length-1;i++){
// //             for(int j=i+1;j<nums.length;j++){
// //                 if(gcd(nums[i],nums[j])){
// //                     return nums.length-1;
// //                 }
// //             }
// //         }

// //         return -1;

        
// //     }
// //     private boolean gcd(int a, int b){
        
// //         if(b==0)return false;
// //         else if(b==1 || a % b==1) return true;
// //         else return gcd(b,a % b);

// //     }




// }

class Solution {
    public int minOperations(int[] nums) {
        int gcd = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int ans = 0;
                for (int x : nums) {
                    if (x != 1) ans++;
                }
                return ans;
            }
            if (i < nums.length - 1)
                gcd = gcd(gcd, nums[i + 1]);
        }

        if (gcd != 1) return -1;

        int ans = (int) 1e9;
        for (int i = 0; i < nums.length; i++) {
            int g = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    ans = Math.min(ans, j - i - 1 + nums.length);
                    break;
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
