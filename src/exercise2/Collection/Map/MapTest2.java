package exercise2.Collection.Map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("手表",100);
        map.put("手表",220);
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);


        //集合大小
        System.out.println(map.size());

        //清空集合
        /*map.clear();
        System.out.println(map);*/

        //判断集合是否为空、如果集合为空就返回true
        map.isEmpty();

        //获取键对应值
        System.out.println(map.get("手表"));
        System.out.println(map.get("手机"));
        //如果没有这个键就会返回null
        System.out.println(map.get("hhh"));

        //根据键删除元素
        System.out.println(map.remove("手表"));
        System.out.println(map);

        //判断是否包含某键
        System.out.println(map.containsKey("手表"));
        System.out.println(map.containsKey("手机"));
        System.out.println(map.containsKey("Java"));
        System.out.println(map.containsKey("java"));

        //判断是否包含某个值
        System.out.println(map.containsValue(2));
        System.out.println(map.containsValue("2"));

        //获取map集合中的全部键,使用一个set集合接取这些，因为set不重复
        Set<String> keys=map.keySet();
        System.out.println(keys);

        //将对应的值放在collection集合(collection为一个父类，方便)中，这是由于值可能重复，因此选择使用collection没有定性要求
        Collection<Integer> values=map.values();
        System.out.println(values);

        //将其余map中的数据放在一个新的map中
        Map<String,Integer> map1=new HashMap<>();
        map1.put("java1",10);
        map1.put("java2",20);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("java3",10);
        map2.put("java2",222);

        //将map2中的元素全部放入map1集合中
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
