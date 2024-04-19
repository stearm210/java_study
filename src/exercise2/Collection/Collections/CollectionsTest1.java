package exercise2.Collection.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsTest1 {
    public static void main(String[] args) {
        //1.为集合批量添加数据
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"aaa","bbb","ccc","ddd");//批量添加数组
        System.out.println(names);

        //2.打乱List集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.对List集合中的元素进行升序排序
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        //4.对List集合中元素排序，可以按照比较器对象指定的规则进行排序

    }
}
