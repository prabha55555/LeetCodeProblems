class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> ctw = new HashMap<>();
        Map<String, Character> wtc = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!ctw.containsKey(c)) {
                ctw.put(c, word);
            }

            if (!wtc.containsKey(word)) {
                wtc.put(word, c);
            }

            if (!ctw.get(c).equals(word) || !wtc.get(word).equals(c)) {
                return false;
            }
        }

        return true;        
    }
}