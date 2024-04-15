package exercise.example;

import java.util.ArrayList;

public class code2 {
    public static void main(String[] args) {
        //创建ArrayList对象(String类型)
        ArrayList<String> list=new ArrayList<>();
        list.add("aa");
        list.add("llll");
        System.out.println(list);
        //插入到某个为止
        list.add(2,"ll");
        System.out.println(list);
        //获得
        String rs=list.get(2);
        //删除(删除第一次出现的值)
        list.remove("aa");
        System.out.println(list);
        //修改某个索引值对象
        list.set(1,"oo");

        //得到长度
        int len=list.size();
        System.out.println(len);
    }
}
