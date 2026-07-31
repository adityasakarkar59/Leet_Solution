class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> bc = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            bc.putIfAbsent(key,new ArrayList<>());
            bc.get(key).add(s);
        }
        return new ArrayList<>(bc.values());
    }
}