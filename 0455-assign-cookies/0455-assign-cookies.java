class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n1=g.length;
        int n2=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
           int count =0;
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(s[j]>=g[i]){
                    s[j]=-1;
                    
                    
                    count++;
                    break;
                    }
                }
            }
            return count;
        }
        
    }
