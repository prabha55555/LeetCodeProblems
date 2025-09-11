// class Solution {
//     public String sortVowels(String s) {

//         String str="uoiea";
//         int index=0;

//         HashMap<Character,Integer> arr= new HashMap<>();
//         arr.put('A', 65);
//         arr.put('E', 69);
//         arr.put('I', 73);
//         arr.put('O', 79);
//         arr.put('U', 85);

//         arr.put('a', 97);
//         arr.put('e', 101);
//         arr.put('i', 105);
//         arr.put('o', 111);
//         arr.put('u', 117);
    
//     List<Integer> arrr=new ArrayList<>();
        
//         for(char ch : s.toCharArray()){
//             if(arr.contains(ch)){
//                 arrr.add(arr.get(ch));
//             }
        
//         }

//         Collections.sort(arrr);
        
//         char[] ch=s.toCharArray();

//         String st="aeiouAEIOU";

//         for(int i=0;i<ch.length;i++){
//             if(st.indexOf(ch[i])!=0)){
//                 ch[i]=arr.getKey(arrr.get(j++));
//             }
//         }


//         // return new String(ch);
//     }
// }



class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        String vowelSet = "aeiouAEIOU";

        for (char ch : s.toCharArray()) {
            if (vowelSet.indexOf(ch) != -1) {
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);

        char[] result = s.toCharArray();
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if (vowelSet.indexOf(result[i]) != -1) {
                result[i] = vowels.get(j++);
            }
        }

        return new String(result);
    }
}
