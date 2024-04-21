package exercise2.Collection.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest1 {
    public static void main(String[] args) {
        //这个是无序、不重复、无索引、按照键的
        //Map<String,Integer> map=new HashMap<>();

        //这个是按照键、有序、不重复、无索引的
        Map<String,Integer> map=new LinkedHashMap<>();

        map.put("手表",100);
        map.put("手表",220);
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);
    }
}
