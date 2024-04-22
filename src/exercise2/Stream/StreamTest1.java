package exercise2.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"张三丰","啊啊啊","张kk","ooo","张ii");
        System.out.println(names);

        //只要是以“张”开头，就将其放入新数组
        //使用传统的方法进行添加
        List<String> list=new ArrayList<>();
        for (String name:names){
            if (name.startsWith("张") && name.length()==3){
                list.add(name);
            }
        }
        System.out.println(list);

        //使用Stream流
        //filter括号中的意思表示对应字符串需要达到的条件(对应的限制条件)。collect方法表示执行完成之后的字符串应该放在哪个位置，或者说应该使用哪个集合装住，这里使用了List集合，List使用Collections调用。
        List<String> list2=names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).collect(Collectors.toList());
        System.out.println(list2);
    }
}
