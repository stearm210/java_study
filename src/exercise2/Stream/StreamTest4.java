package exercise2.Stream;

import java.util.*;
import java.util.stream.Collectors;

//终结方法
public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Student s1=new Student("蜘蛛精",26,172.5);
        Student s2=new Student("蜘蛛精",26,172.5);
        Student s3=new Student("紫霞",23,167.6);
        Student s4=new Student("百晶晶",25,169.8);
        Student s5=new Student("牛魔王",35,183.3);
        Student s6=new Student("牛夫人",34,168.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);

        //计算升高超过168的同学有多少人
        long size=students.stream().filter(s -> s.getHeight()>168).count();
        System.out.println(size);

        //找出升高最高的学生对象
        //这里使用了一个排序方法
        Student s = students.stream().max(((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()))).get();
        System.out.println(s);

        //找出升高最小的学生对象
        //这里使用了一个排序方法
        Student ss=students.stream().min(((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()))).get();
        System.out.println(ss);


        //stream流收集的方法
        //收集流使用.collect方法
        //找到升高超过170的学生，并且将其放到一个集合中返回
        List<Student> students1 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toList());
        System.out.println(students1);


        //stream收集到一个set集合中
        Set<Student> students2=students.stream().filter(a -> a.getHeight()>170).collect(Collectors.toSet());


        //找出升高超过170的学生对象，并把学生对象名字和升高存入到一个map集合中
        //如果需要将stream流存入数组，就需要使用toMap方法，并且在这里面对键和值进行指认
        Map<String,Double> map=students.stream().filter(a -> a.getHeight()>170).distinct().collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(map);


        //将数组中的内容进行收入
        Object[] arr=students.stream().filter(a -> a.getHeight()>170).toArray();
        //数组的输出方法
        System.out.println(Arrays.toString(arr));
    }
}
