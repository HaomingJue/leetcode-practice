class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] incoming = new int[n];
        for (int i = 0; i < edges.size(); i++) {
            incoming[edges.get(i).get(1)]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < incoming.length; i++) {
            if (incoming[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}