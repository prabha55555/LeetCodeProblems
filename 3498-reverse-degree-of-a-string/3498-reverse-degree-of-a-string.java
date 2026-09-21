class Solution {
    public int reverseDegree(String s) {

        HashMap<Character,Integer> values = new HashMap<>();
        int num=26;

        for(char val = 'a' ; val<='z';val++){

            values.put(val,num);
            num--;

        }

        int sum=0;

        for(int i=0;i<s.length();i++){

            sum+=values.get(s.charAt(i)) * (i+1);
        }


        return sum;
    }
}