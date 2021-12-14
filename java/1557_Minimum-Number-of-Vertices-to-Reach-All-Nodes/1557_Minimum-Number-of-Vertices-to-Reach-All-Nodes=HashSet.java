class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> set = new HashSet<>();
        for (List<Integer> edge : edges) {
            set.add(edge.get(1));
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}