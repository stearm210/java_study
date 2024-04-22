package exercise2.Map.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest1 {
    public static void main(String[] args) {

        //或者这里使用一个compare的类中方法，通过调用对象进行排序操作
        Map<Student,String> map=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getHeight(), o1.getHeight());//进行降序排序
            }
        });
        map.put(new Student("蜘蛛精",25,168.8),"盘丝洞");
        map.put(new Student("蜘蛛精",25,168.8),"水帘洞");
        map.put(new Student("至尊宝",23,163.8),"水帘洞");
        map.put(new Student("牛魔王",28,183.5),"牛头山");
        System.out.println(map);
    }
}
