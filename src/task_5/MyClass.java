package task_5;

public class MyClass <T> {
    private T value;

    private MyClass(T value) {
        this.value = value;
    }

    public static <T> MyClass<T> factoryMethod(T value) {
        return new MyClass<>(value);
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass<String> myStringInstance = MyClass.factoryMethod("name");
        System.out.println(myStringInstance.getValue());

        MyClass<Integer> myIntegerInstance = MyClass.factoryMethod(1);
        System.out.println(myIntegerInstance.getValue());
    }
}