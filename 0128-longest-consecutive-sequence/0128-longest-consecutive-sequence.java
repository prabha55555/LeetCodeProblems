class Solution {
    public int longestConsecutive(int[] nums) {
           if (nums.length == 0) return 0;

    Set<Integer>arr=new TreeSet<>();
    for(int i : nums){
        arr.add(i);
    }

    List<Integer> res=new ArrayList<>(arr);

    int count=0,c=res.get(0),max=0;


    for(int i=0;i<res.size();i++){
        if(res.get(i)==c){
            c++;
            count++;
            max=Math.max(count,max);
    }
    else{
        c=res.get(i)+1;
        count=1;
    }
    }

    return max;
        
    }
}