class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String first = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String res = "";

            int limit = Math.min(first.length(), strs[i].length());

            for (int j = 0; j < limit; j++) {
                if (first.charAt(j) == strs[i].charAt(j)) {
                    res += first.charAt(j);
                } else {
                    break;
                }
            }

            first = res;

            if (first.isEmpty()) return "";
        }

        return first;
    }
}