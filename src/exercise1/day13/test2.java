package exercise1.day13;

public class test2 {
    public static void main(String[] args) {
        //
        MyArrayList<String> list=new MyArrayList();
        list.add("java1");
        list.add("java2");
        String ele=list.get(1);
        System.out.println(ele);

        //下面这个泛型中，可以进行操作的是两个String类型。
        MyClass<String,String> c2=new MyClass();
    }
}
