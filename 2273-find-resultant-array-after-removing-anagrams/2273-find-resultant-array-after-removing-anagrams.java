class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        
      
        result.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
           
            if (!isAnagram(words[i], result.get(result.size() - 1))) {
                result.add(words[i]);
            }
        }
        
        return result;
    }
    
    
    private boolean isAnagram(String a, String b) {
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }
}