package generic;

class MyArray<T>{
    T[] arr;

    static private final int INITIAL_SIZE = 10;

    private int size;

    MyArray(){
        arr = (T[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    boolean add(T object){
        if(size < INITIAL_SIZE){
            arr[size] = object;
            size++;
            return true;
        }
        return false;
    }

    T get(int index){
        if(index < size){
            return arr[index];
        }
        return null;
    }
}

public class GenericMain1 {
    public static void main(String[] args) {
        MyArray<Integer> array = new MyArray<>();

        array.add(10);
//        array.add("10"); -> Integer타입이 아닌걸 넣어서 컴파일 에러

        System.out.println(array.get(0));
    }
}
