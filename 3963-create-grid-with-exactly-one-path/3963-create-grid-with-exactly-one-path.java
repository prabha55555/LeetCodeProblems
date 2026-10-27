class Solution {
    public String[] createGrid(int m, int n) {

        String[] result = new String[m];

        String str = "#".repeat(n-1) +".";

        String rest = ".".repeat(n);

        result[0]=rest;

        for(int i=1;i<m;i++){
            result[i]=str;
        }

        return result;
        
    }
}