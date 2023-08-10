package task_3;

import java.util.ArrayList;

import java.util.List;

public class MyDictionary<K, V> {
    private List<Pair<K, V>> para = new ArrayList<>();

    public void addPair(K key, V value) {
        para.add(new Pair<>(key, value));
    }

    public V getValueAt(int index) {
        if (index >= 0 && index < para.size()) {
            return para.get(index).getValue();
        }
        return null;
    }

    public int getSize() {
        return para.size();
    }

    private class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }
    }
}
