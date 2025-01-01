class Solution {
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
                
            }else{
                int currFreq= mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>mp1=makeFreqMap(s);
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            if(!mp1.containsKey(ch)) return false;
            int currFreq= mp1.get(ch);
            mp1.put(ch,currFreq-1);
        }
        for( Integer i: mp1.values()){
            if(i!=0)return false;
        }
        return true;
    }
}