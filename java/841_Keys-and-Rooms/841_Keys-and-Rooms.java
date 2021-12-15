class Solution {
    boolean[] array;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        array = new boolean[rooms.size()];
        array[0] = true;
        dfs(rooms, 0);
        for (boolean a : array) {
            if (!a) return false;
        }
        return true;
    }
    
    private void dfs(List<List<Integer>> rooms, int i) {
        List<Integer> keys = rooms.get(i);
        for (Integer key : keys) {
            if (array[key] == false) {
                array[key] = true;
                dfs(rooms, key);
            }
        }
    }
}