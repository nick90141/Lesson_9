package task_2;

import java.util.ArrayList;

public class MyList <T>{
    public ArrayList<T> List;

    public MyList() {
        List = new ArrayList<>();
    }

    public void add(T element) {
        List.add(element);
    }

    public T get(int index) {
        return List.get(index);
    }

    public int getSize() {
        return List.size();
    }

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Запись 1");
        myList.add("Запись 2");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.getSize());
    }
}