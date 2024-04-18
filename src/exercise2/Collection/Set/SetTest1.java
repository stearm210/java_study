package exercise2.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

        //排序、不重复、无索引
        Set<Integer> set2=new TreeSet<>();
        set2.add(666);
        set2.add(555);
        set2.add(555);
        set2.add(888);
        set2.add(777);
        set2.add(888);
        System.out.println(set2);
    }
}
