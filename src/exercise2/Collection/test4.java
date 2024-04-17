package exercise2.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;


//使用Lambda表达式
public class test4 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        System.out.println(c);

        //使用一个接口的匿名内部类进行对象的创建（因为接口是不能直接创建对象的）
        //accept函数的参数s是代表集合中的元素
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //完成对应集合的遍历
                System.out.println(s);
            }
        });

        //第一次简化
        c.forEach((String s)->{
            System.out.println(s);
        });

        //第二次简化
        c.forEach(s->{
            System.out.println(s);
        });

        //第三次简化
        c.forEach(s-> System.out.println(s));

        //第四次简化
        c.forEach(System.out::println);
    }
}
