class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,List<String>> arr = new HashMap<>();

        List<List<String>> result = new ArrayList();

        for(String i : strs){
            char[] ch =i.toCharArray();
            Arrays.sort(ch);
            String sort = new String(ch);
            if(!arr.containsKey(sort)){
                arr.put(sort, new ArrayList());
            }
            arr.get(sort).add(i);
        }


        for(String str : arr.keySet()){

            result.add(arr.get(str));

        }

        return result;
        
    }
}