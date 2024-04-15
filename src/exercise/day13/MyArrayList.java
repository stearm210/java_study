package exercise.day13;

//下面这个是泛型类
//泛型类<>中接着类型。可以选择不同的类型
public class MyArrayList<E> {
    private Object[] arr=new Object[10];
    private int size;//记录当前位置
    public boolean add(E e){
        arr[size++]=e;
        return true;
    }
    public E get(int index){
        return (E)arr[index];
    }
}
