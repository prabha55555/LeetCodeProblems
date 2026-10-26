class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int copyarr[] = arr.clone();

        Arrays.sort(copyarr);
        
        HashMap<Integer,Integer> rank = new HashMap<>();

        int index=1;

        for(int i : copyarr){
            if(!rank.containsKey(i))
               rank.put(i,index++);

        }

        for(int i=0;i<arr.length;i++){
            arr[i]=rank.get(arr[i]);
        }

        return arr;
        
    }
}