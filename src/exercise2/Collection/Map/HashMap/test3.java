package exercise2.Collection.Map.HashMap;

import java.util.ArrayList;
import java.util.Iterator;

public class test3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> sites=new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        //获取迭代器,这里的循环迭代是对String类型进行的
        //这里的sites.iterator()表示这里是对sites进行操作
        Iterator<String> it=sites.iterator();
        //输出集合中的第一个元素
        System.out.println(it.next());

        //循环进行迭代
        //while(当)存在it.hasNext()，就是此数组还有元素时，就会进行迭代
        //这里的it.next()是输出下一个元素的意思
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //删除元素
        //删除集合中小于10的元素
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        //这里的迭代器表示是对numbers这个整数列表进行迭代
        Iterator<Integer> a=numbers.iterator();
        //a.hasNext()的意思表示这个numbers是否非空，即是否还有元素存在在里面
        while (a.hasNext()){
            Integer i=a.next();
            if(i<10){
                a.remove();
            }
        }
        System.out.println(numbers);

    }
}
