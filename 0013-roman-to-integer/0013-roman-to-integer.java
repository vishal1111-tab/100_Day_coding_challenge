class Solution {
    public int romanToInt(String s) {
        HashMap <Character , Integer> hm = new HashMap<>();
        hm.put('I' , 1);
        hm.put('V' , 5);
        hm.put('X' , 10);
        hm.put('L' , 50);
        hm.put('C' , 100);
        hm.put('D' , 500);
        hm.put('M' , 1000);
        int res = 0;
        int i= s.length()-1;
        while(i>0){
        char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-1);
            int val1 = hm.get(ch1);
            int val2 = hm.get(ch2);

            if(val1 > val2){
                res = res + (val1 - val2);
                i-=2;
            }
            else{
                System.out.println(res);
                res+=val1;
                i--;
            }
        }
        char c = s.charAt(0);
        int x = hm.get(c);
        if(i==0){
            return res+x;
        }
        return res ;
            


    }
}