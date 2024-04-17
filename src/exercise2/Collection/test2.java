package exercise2.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test2 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        System.out.println(c);

        //1.从集合对象中获取迭代器对象
        Iterator<String> it=c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        //2.使用循环结合迭代器遍历集合
        while (it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }


    }
}
