class Solution {
    public boolean uniqueOccurrences(int[] arr) {

       HashMap<Integer,Integer> map= new HashMap<>();

       for(int num : arr){

        map.put(num,map.getOrDefault(num,0)+1);
       }
    
     List<Integer> result1 =new ArrayList<>();
     Set<Integer> result2 = new HashSet<>();

     for(int num : map.values()){

        result1.add(num);
        result2.add(num);
     }

      return result1.size()==result2.size();
    }
   
}
