class Solution {
    public int numberOfSpecialChars(String word) {

            Set<Character> str = new HashSet<>();
            Set<Character> str1 = new HashSet<>();

            for(char ch : word.toCharArray()){
                if(ch >='a' && ch<='z'){
                    str.add(ch);
                }else if(ch >='A' && ch<='Z'){
                    str1.add(ch);


                }
            }

            int count=0;

            for(char ch : str){
                if(str1.contains(Character.toUpperCase(ch))){
                    count++;
                }
            }

            return count;
           
            

         
        
    }
}