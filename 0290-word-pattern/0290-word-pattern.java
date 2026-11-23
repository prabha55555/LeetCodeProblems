class Solution {
    public boolean wordPattern(String pattern, String s) {

        

        HashMap<Character, String> ctw = new HashMap<>();
        HashMap<String,Character> wtc = new HashMap<>();

        String[] values=s.split("\\s+");

        if(pattern.length()!=values.length)return false;

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = values[i];

            if(!ctw.containsKey(ch)){
                ctw.put(ch,word);
            }
            if(!wtc.containsKey(word)){
                wtc.put(word,ch);
            }
            if(!ctw.get(ch).equals(word) || !wtc.get(word).equals(ch)){
                return false;
            }

            
             }

             return true;
        
    }
}