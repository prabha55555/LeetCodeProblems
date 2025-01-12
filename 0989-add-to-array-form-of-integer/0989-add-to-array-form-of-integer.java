class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer>  result =new ArrayList<>();
        int len = num.length - 1;
        
        while(len >= 0 || k != 0){
            
            if(len >= 0){
                k += num[len--];
            }
            
            result.addFirst(k % 10);
            k /= 10;
        }
            
        return result;
        
    }
}
