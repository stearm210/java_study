package exercise2.Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {

        //获取list集合的stream流
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"张三丰","张五级","周杰伦","赵毅","张强");

        //list集合获取stream流
        Stream<String> stream = names.stream();


        //获取set集合的stream流
        Set<String> set=new HashSet<>();
        Collections.addAll(set,"刘德华","张曼玉","蜘蛛精","马的","德马");
        //set集合获取stream流
        Stream<String> stream1 = set.stream();
        //下面写法中forEach表示循环输出这个集合
        stream1.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));


        //注意，map集合不属于collection，因此无法使用上面的方法进行stream调用
        //获取map集合的stream流
        Map<String,Double> map=new HashMap<>();
        map.put("古力娜扎",172.3);
        map.put("迪丽热巴",168.2);
        map.put("马尔扎哈",166.3);
        map.put("卡尔扎巴",189.9);
        //但是，我们可以通过将map集合变成set集合的方式进行stream流调用
        //这里将keys键用set集合进行调用
        Set<String> keys=map.keySet();
        Stream<String> ks = keys.stream();

        //这里使用collection进行值的调用
        Collection<Double> values=map.values();
        Stream<Double> vs = values.stream();

        //将map直接转为collection的方法
        Set<Map.Entry<String,Double>> entries=map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        //使用stream流
        //filter进行过滤(内嵌条件)。contains表示包含某些数据
        kvs.filter(e -> e.getKey().contains("巴")).forEach(e -> System.out.println(e.getKey()+ "--->" +e.getValue()));


        //获取数组的stream流
        String[] names2={"张来了","东方来了","唐就将","孤独看看"};
        //方法一
        Stream<String> s1 = Arrays.stream(names2);

        //方法二
        Stream<String> s2 = Stream.of(names2);
    }
}
