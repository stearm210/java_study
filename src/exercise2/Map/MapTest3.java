package exercise2.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
    public static void main(String[] args) {
        //先准备一个map对象
        Map<String,Double> map=new HashMap<>();
        map.put("蜘蛛精",162.9);
        map.put("蜘蛛精",169.9);
        map.put("紫霞",172.5);
        map.put("至尊宝",178.2);
        map.put("蜘蛛精",193.5);
        System.out.println(map);

        //获取map集合中的全部值
        //获取值肯定用set，因为只用一个键对应一个值进行输出
        //又或者说，set主要是进行快速查找的操作
        Set<String> keys=map.keySet();
        System.out.println(keys);

        //1.for遍历所有的键，并且对应获取值
        //键找值的方法进行遍历
        for (String key:keys){
            //通过键获取值
            double value=map.get(key);
            System.out.println(key+"======>"+value);
        }

        //2.键值对的方法进行遍历
        //使用set进行快速查找的操作
        //使用一个entry将一个键值对进行存储
        //创建新对象时，可以按住“ctrl+alt+v”键进行创建
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key=entry.getKey();//取得键
            Double value=entry.getValue();//取得值
            System.out.println(key+"===>"+value);
        }

        //3.Lambda表达式遍历方法
        //使用forEach方法进行遍历更加方便
        map.forEach((k,v)->{
            System.out.println(k+"===>"+v);
        });
    }
}
