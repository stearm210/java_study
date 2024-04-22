package exercise2.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("蜘蛛精",25,168.8),"盘丝洞");
        map.put(new Student("蜘蛛精",25,168.8),"水帘洞");
        map.put(new Student("至尊宝",23,163.8),"水帘洞");
        map.put(new Student("牛魔王",28,183.5),"牛头山");
        System.out.println(map);

    }
}
