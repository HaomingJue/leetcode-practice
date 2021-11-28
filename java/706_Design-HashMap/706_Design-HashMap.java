class MyHashMap {

    ArrayList<int[]> keys;
    
    
    public MyHashMap() {
        keys = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i)[0] == key) {
                keys.remove(i);
            }
        }
        int[] keyValue = {key, value};
        keys.add(keyValue);
    }
    
    public int get(int key) {
        int size = keys.size();
        for (int i = 0; i < size; i++) {
            if (keys.get(i)[0] == key) {
                return keys.get(i)[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int size = keys.size();
        for (int i = 0; i < size; i++) {
            if (keys.get(i)[0] == key) {
                keys.remove(i);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */