package task_3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();

        dictionary.addPair("one", 1);
        dictionary.addPair("two", 2);
        dictionary.addPair("three", 3);

        System.out.println("Size of dictionary: " + dictionary.getSize());

        System.out.println("Value at index 1: " + dictionary.getValueAt(1));
        System.out.println("Value at index 2: " + dictionary.getValueAt(2));
    }
}
