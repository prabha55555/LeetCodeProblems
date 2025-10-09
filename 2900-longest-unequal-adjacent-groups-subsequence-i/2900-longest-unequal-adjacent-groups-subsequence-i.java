class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {

        List<String> arr =new ArrayList<>();

        int val=-1;

        for(int i=0;i<groups.length;i++){
            if(groups[i]!=val){
                arr.add(words[i]);
                val=groups[i];
            }
        }

        return arr;
        
    }
}