class Solution {
    public boolean isAnagram(String s, String t) {
        var sL = s.length();
        var tL = t.length();

        if(sL != tL) return false;
        int[] count = new int[26];

        for(int i =0 ; i < sL ; i++){

            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
}
