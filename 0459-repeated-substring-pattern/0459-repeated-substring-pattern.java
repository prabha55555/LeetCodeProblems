class Solution {
    public boolean repeatedSubstringPattern(String s) {
       HashMap<Character,Integer>arr=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char st = s.charAt(i);
        arr.put(st,arr.getOrDefault(st,0)+1);
       }
       for(int i : arr.values()){
        if(i<2)return false;
               }
       return true;
    }
}