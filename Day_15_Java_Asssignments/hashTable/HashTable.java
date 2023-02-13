package Day_15_Java_Asssignments.hashTable;

class MapNode <K,V> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MapNode<K, V> getNext() {
        return next;
    }

    public void setNext(MapNode<K, V> next) {
        this.next = (MapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode{" + " Key= ").append(key).append(" Value= ").append(value).append('}');
        if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}
class MyHashMap <K,V> {
    MapNode head;
    MapNode tail;

    public V get(K word) {
        MapNode<K, V> myNode = searchNode(word);
        return (myNode == null) ? null : myNode.getValue();
    }

    public MapNode<K, V> searchNode(K word) {
        MapNode<K, V> currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(word)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void add(K key, V value) {
        MapNode<K, V> myNode = searchNode(key);
        if (myNode == null) {
            myNode = new MapNode<>(key, value);
            this.append(myNode);  
        } else
            myNode.setValue(value);

    }
    
    private void append(MapNode<K, V> myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }

    public void printNodes() {
        System.out.println("My nodes: " + head);
    }
}

public class HashTable {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }

        int frequency = (int) myHashMap.get("to");

        System.out.println(myHashMap);
    }
}