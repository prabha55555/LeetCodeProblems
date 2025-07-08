class Solution {
    public List< List<String>> groupAnagrams(String[] strs) {


     List<List<String>> res= new ArrayList<>();

     HashMap<String,List<String>> map=new HashMap<>();

     for(String st : strs){
        char[] ch=st.toCharArray();
        Arrays.sort(ch);
        String sort=new String(ch);

        if(!map.containsKey(sort)){
            map.put(sort,new ArrayList<>());
        }
        map.get(sort).add(st);
     }

     for(String st : map.keySet()){
        res.add(map.get(st));
     }

     return res;



        
    }
}