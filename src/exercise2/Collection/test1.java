package exercise2.Collection;

import java.util.ArrayList;
import java.util.Collection;

///Collection进行对应函数的编写
public class test1 {
    public static void main(String[] args) {
        //多态写法进行collection
        Collection<String> c=new ArrayList<>();
        //1.添加元素的方法
        //public boolean add
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        c.add("java4");
        System.out.println(c);
        //2.清空集合的方法
        //public void clear()
        //c.clear();
        System.out.println(c);


        //3.判断集合是否为空的方法
        //public boolean isEmpty()
        System.out.println(c.isEmpty());

        //4.获取集合大小的方法
        System.out.println(c.size());

        //5.判断集合中是否包含哪个元素的方法
        System.out.println(c.contains("kkk"));

        //6.删除多个元素的方法，拥有多个元素时删除对应元素的方法
        System.out.println(c.remove("kkk"));
        System.out.println(c);

        //7.将集合转成数组的方法
        c.toArray();

        //将另一个集合中的数据加入到一个集合中的办法
        Collection<String> c1=new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2=new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);//这里是将c2集合中的数据放入到c1集合中去，一般来说，需要这两个集合类型一致
    }
}
