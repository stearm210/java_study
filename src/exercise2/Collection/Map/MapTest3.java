package exercise2.Collection.Map;

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
        Set<String> keys=map.keySet();
        System.out.println(keys);

        //遍历所有的键，并且对应获取值
        for (String key:keys){
            //通过键获取值
            double value=map.get(key);
            System.out.println(key+"======>"+value);
        }
    }
}
