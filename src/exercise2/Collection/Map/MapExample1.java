package exercise2.Collection.Map;

import java.util.*;

public class MapExample1 {
    public static void main(String[] args) {
        //1.把80个学生选择的数据得出
        List<String> data=new ArrayList<>();
        String[] selects={"A","B","C","D"};

        //定义一个随机数
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            //每次模拟一个学生选择一个景点，存入到集合中去
            int index=r.nextInt(4);

            //每次选取随机数对应的元素存到data中
            data.add(selects[index]);
        }
        //输出data
        System.out.println(data);

        //开始统计每个景点的投票人数
        //准备一个map集合用于统计最终的结果
        Map<String,Integer> result=new HashMap<>();

        //遍历80个景点数据
        for (String s:data){
            //每次循环时询问map中是否存在这个景点
            if(result.containsKey(s)){
                //说明这个景点之前统计过，值加一
                result.put(s,result.get(s)+1);//这里put进去的值是键值对
            }else {
                //说明景点第一次存入，景点+1
                result.put(s,1);//这里put进去的值是键值对
            }
        }
        System.out.println(result);
    }
}
