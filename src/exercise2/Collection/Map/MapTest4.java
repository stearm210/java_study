package exercise2.Collection.Map;


//集合的嵌套
//集合内部再增加一个集合实现
//什么时候使用呢？  比如说：湖北省中的所有城市
//                      江西省中的所有城市

import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        //这里使用一个集合的嵌套
        Map<String, List<String>> map=new HashMap<>();

        //上面创建了一个map集合之后，下面也要创建一个list集合
        List<String> cities1=new ArrayList<>();
        //这里使用Collections类对集合进行操作，批量添加元素
        Collections.addAll(cities1,"南京市","扬州市","苏州市","无锡市","杭州市");
        map.put("江苏省",cities1);
        System.out.println(map);
    }
}
