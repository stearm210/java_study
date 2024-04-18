package exercise2.ArryList_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        //创建一个ArrayList集合对象
        //下面是一个经典代码
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //在某个索引位置插入元素
        list.add(2,"kkk");
        System.out.println(list);

        //根据索引删除元素，返回删除的元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //返回集合中指定位置的元素、
        System.out.println(list.get(3));

        //修改索引处的元素，修改成功的会返回对应的数据
        System.out.println(list.set(3, "www"));
        System.out.println(list);
    }
}
