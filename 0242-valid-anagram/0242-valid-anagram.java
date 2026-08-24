class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> mpp = new HashMap <>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            mpp.put(s1, mpp.getOrDefault(s1,0) + 1);
            mpp.put(t1, mpp.getOrDefault(t1,0) - 1);
        }

        for( int val : mpp.values()) {
            if (val != 0) return false;
        }

        return true;

    }
}