package exercise2.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        //多态写法形式，经典写法，建议
        Set<Integer> set=new HashSet<>();
        //无序、不重复、无索引
        set.add(666);
        set.add(666);
        set.add(555);
        set.add(555);
        set.add(777);
        System.out.println(set);

        //有序、不重复、无索引
        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(666);
        set1.add(555);
        set1.add(555);
        set1.add(888);
        set1.add(888);
        set1.add(777);
        System.out.println(set1);

    }
}
