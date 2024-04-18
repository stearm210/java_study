package exercise2.Collection.List;

import java.util.LinkedList;

public class test1 {
    public static void main(String[] args) {
        //下面这个是普通的创建方法
        LinkedList<String> str=new LinkedList<String>();
        str.add("Google");
        str.add("Runoob");
        str.add("Taobao");
        System.out.println(str);//这里是一个列表样式的输出

        System.out.println("-------------------------------");

        //列表头部增加元素
        str.addFirst("WiKi");
        System.out.println(str);

        //列表尾部添加元素
        str.addLast("ooo");
        System.out.println(str);

        //列表移除开头元素
        str.removeFirst();
        System.out.println(str);

        //列表移除结尾元素
        str.removeLast();
        System.out.println(str);

        //获取列表开头的元素
        System.out.println(str.getFirst());

        //获取列表尾部的元素
        System.out.println(str.getLast());

        //元素的迭代
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
