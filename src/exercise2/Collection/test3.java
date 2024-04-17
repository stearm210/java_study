package exercise2.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class test3 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        System.out.println(c);

        //增强for循环的操作
        //ele对应这个集合中的元素。c为这个集合的名字
        for(String ele : c){
            System.out.println(ele);
        }

        String[] names={"x","y","z"};
        for(String k : names){
            System.out.println(k);
        }
    }
}
