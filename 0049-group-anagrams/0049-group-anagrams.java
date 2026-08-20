class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<String> result = new ArrayList<>();
        HashMap<String,List<String>> mpp = new HashMap<>();

        for (int i = 0; i<strs.length; i++) {
            char[] c = strs[i].toCharArray(); 
            Arrays.sort(c);
            String sortedFirst = new String(c);

            if (!mpp.containsKey(sortedFirst)) {
                mpp.put(sortedFirst, new ArrayList<>());
            }
            mpp.get(sortedFirst).add(strs[i]);

        }
        return new ArrayList<>(mpp.values());
    }
}