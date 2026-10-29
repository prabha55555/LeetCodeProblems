class Solution {
    public int minOperations(String s) {

        char min = s.charAt(0);
        char max = s.charAt(0);
        boolean issorted = true;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(i-1))issorted=false;
            if(s.charAt(i)<min)min=s.charAt(i);
            if(s.charAt(i)>max)max=s.charAt(i);
        } 

        if(issorted)return 0;
        if(s.length()==2)return -1;

        if(s.charAt(0)==min || s.charAt(s.length()-1)==max)return 1;

        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==min || s.charAt(i)==max)return 2;
        }

        return 3;


        }
        
    
}