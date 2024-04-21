package exercise2.Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
    public static void main(String[] args) {
        //经典方法用于构造对象
        //无序、不重复、无索引
        Map<String,Integer> map=new HashMap<>();

        //有序、不重复、无索引
        Map<String,Integer> map1=new LinkedHashMap<>();

        //可排序、不重复、无索引
        Map<Integer,String> map2=new TreeMap<>();//

        map.put("手表",300);
        map.put("手机",220);
        map.put("手机",2);//当键重复时，后面相同键的值会替代前面键对应的值
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);

        //treemap使用
        map2.put(23,"Java");
        map2.put(23,"MySQL");
        map2.put(19,"李四");
        map2.put(20,"王五");
        System.out.println(map2);

    }
}
