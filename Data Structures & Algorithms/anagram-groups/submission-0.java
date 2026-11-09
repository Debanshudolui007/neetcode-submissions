class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map =new HashMap<>();
        for (String s : strs){
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            String sos = new String(carr);
            map.putIfAbsent(sos, new ArrayList<>());
            map.get(sos).add(s);
        }
        return new ArrayList<>(map.values());  
    }
}
