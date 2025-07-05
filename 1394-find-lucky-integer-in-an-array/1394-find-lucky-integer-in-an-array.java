class Solution {
    public int findLucky(int[] arr) {


    HashMap<Integer,Integer> res=new HashMap<>();

    for(int i : arr){
        res.put(i,res.getOrDefault(i,0)+1);
    }
    int  max=-1;
    for(int i : res.keySet()){
        int key=i;
        int val=res.get(i);
        if(key==val){
            max=Math.max(key,max);
        }
    }
        return max;
        
    }
}