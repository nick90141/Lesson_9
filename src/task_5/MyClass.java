package task_5;

public class MyClass<T> {
    private T value;

    private MyClass(T value) {
        this.value = value;
    }

    public static <T> MyClass<T> factoryMethod(Class<T> clazz, T value) {
        return new MyClass<>(value);
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass<String> myStringInstance = MyClass.factoryMethod(String.class, "name");
        System.out.println(myStringInstance.getValue());

        MyClass<Integer> myIntegerInstance = MyClass.factoryMethod(Integer.class, 1);
        System.out.println(myIntegerInstance.getValue());
    }
}
