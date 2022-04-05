class Solution {
    public int maxNumberOfBalloons(String text) {
        int alphabets[]=new int[26];
        
        for(int i=0;i<text.length();i++){
            alphabets[text.charAt(i)-'a']++;
        }
        
        int min=alphabets[1]; //b
        min=Math.min(min,alphabets[0]);//a
        min=Math.min(min,alphabets[11]/2);//l
        min=Math.min(min,alphabets[14]/2); //o
        min=Math.min(min,alphabets[13]); //n
        
        return min;
    }
}

// class Solution {
//     public int maxNumberOfBalloons(String text) {
//         HashMap<Character,Integer> map = new HashMap<>();
// 	    map.put('b',0);
//         map.put('a',0);
//         map.put('l',0);
//         map.put('o',0);
//         map.put('n',0);
//         char chars[] = text.toCharArray();
// 	    for(char ch : chars) {
// 		    if(map.containsKey(ch)) {
//                 map.put(ch, map.get(ch) + 1);
//             }
//         }
//         int min = map.get('b');
//         min = Math.min(min, map.get('a'));
//         min = Math.min(min, map.get('l') / 2);
//         min = Math.min(min, map.get('o') / 2);
//         min = Math.min(min, map.get('n'));
// 	    return min;
//     }
// }