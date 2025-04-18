class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> arr=new HashMap<>();

        
     arr.put('I',1);  
    arr.put('V',5);
    arr.put('X',10);
    arr.put('L',50);
    arr.put('C',100);
    arr.put('D',500);
    arr.put('M',1000);
    int total=0;
    for(int i=0;i<s.length();i++){
        if(i < s.length() - 1 && arr.get(s.charAt(i)) < arr.get(s.charAt(i + 1)))

            total-=arr.get(s.charAt(i));
    
    else{
    total+=arr.get(s.charAt(i));
    }
    }
     return total;   
    }
}
