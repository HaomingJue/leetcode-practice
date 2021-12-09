class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int cur = 0;
        while (list.size() > 1) {
            cur = (cur + k - 1) % list.size();
            list.remove(cur);
        }
        return list.get(0);
    }
}