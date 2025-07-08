class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer>arr=new HashMap<>();

        for(char i : s.toCharArray()){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        Queue<Character> pq=new PriorityQueue<>((a,b)-> arr.get(b)-arr.get(a));


        for(char ch: arr.keySet()){
            pq.add(ch);
            }
     StringBuilder str = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            int val = arr.get(ch);

            for(int i=0;i<val;i++){
                str.append(ch);
            }
        }


        

        return str.toString();


        
    }
}