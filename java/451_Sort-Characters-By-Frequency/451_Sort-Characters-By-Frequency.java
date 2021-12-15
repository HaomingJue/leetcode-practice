class Solution {
    
    HashMap<Character, Integer> map;
    
    private class FrequencyComparator implements Comparator<Character> {
        @Override
        public int compare(Character a, Character b) {
            return map.get(b) - map.get(a);
        }
    }
    
    public String frequencySort(String s) {
        map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(new FrequencyComparator());
        for (Character c : map.keySet()) {
            pq.add(c);
        }
        
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int frequency = map.get(c);
            for (int i = 0; i < frequency; i++) ans.append(c);
        }
        return ans.toString();
    }
}