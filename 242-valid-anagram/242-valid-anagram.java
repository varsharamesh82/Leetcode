class Solution {
    public boolean isAnagram(String s, String t) {
         int n = s.length();
         int m=t.length();
         if(n!=m)
             return false;
        else{
            HashMap<Character, Integer> o= new HashMap<Character,Integer>();
       for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(!o.containsKey(c))
            { o.put(c,1);
           } else {
                 o.put(c,o.get(c)+1);
            }}
                HashMap<Character, Integer> p= new HashMap<Character,Integer>();
            for (int j = 0; j < m; j++) {
            char d = t.charAt(j);
            if(!p.containsKey(d))
            { p.put(d,1);
           } else {
                 p.put(d,p.get(d)+1);
            }
    
  }     if(o.equals(p))
                return true;
} return false;
    }}
    
 