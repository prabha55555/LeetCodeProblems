class Solution {
    public boolean uniqueOccurrences(int[] arr) {

       HashMap<Integer,Integer> map= new HashMap<>();

       for(int num : arr){

        map.put(num,map.getOrDefault(num,0)+1);
       }
    
    HashSet<Integer> result = new HashSet<>();
    for(int nums : map.values()){
        if(!result.add(nums))
        return false;


    }
    return true;
}
}