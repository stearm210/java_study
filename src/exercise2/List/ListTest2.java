package exercise2.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList类似于数组操作问题

public class ListTest2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //for循环
        for (int i = 0; i < list.size(); i++) {
            String s= list.get(i);
            System.out.println(s);
        }

        //迭代器
        Iterator<String> it=list.iterator();
        //it.hasNext()用于判断是否还有下一个元素
        while (it.hasNext()){
            //it.next()输出下一个元素
            System.out.println(it.next());
        }

        //foreach
        for (String s : list) {
            System.out.println(s);
        }

        //Lambda表达式
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
