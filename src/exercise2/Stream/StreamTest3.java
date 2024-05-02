package exercise2.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores=new ArrayList<>();
        Collections.addAll(scores,88.5,100.0,60.0,99.0,9.5,99.6,25.0);
        //需求1，找出成绩大于60的数据，并且升序排序再输出
        //filter中的方法是使得scores中的数据大于60。之后再调用sorted方法进行升序排序。再调用forEach进行循环输出
        scores.stream().filter(s -> s>=60).sorted().forEach(s -> System.out.println(s));
        List<Student> students=new ArrayList<>();
        Student s1=new Student("蜘蛛精",26,172.5);
        Student s2=new Student("蜘蛛精",26,172.5);
        Student s3=new Student("紫霞",23,167.6);
        Student s4=new Student("百晶晶",25,169.8);
        Student s5=new Student("牛魔王",35,183.3);
        Student s6=new Student("牛夫人",34,168.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);

        //找出年龄大于23且年龄小于30的学生降序排序
        //sorted中的o1.getage()-o2.getage()表示降序排序的写法
        students.stream().filter(s -> s.getAge()>=23 && s.getAge()<=30).sorted((o1,o2) -> o2.getAge()- o1.getAge()).forEach(s -> System.out.println(s));

        //找出升高降序排序的人
        //由于升高时double，因此需要调用double中的compare方法进行降序排序
        //这里加上limit(3)是将前面3个学生取出
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), -o1.getHeight())).limit(3).forEach(s-> System.out.println(s));

        //将升高最后两位的学生进行输出
        //这里使用了skip跳过前面3个，直接会得到最后两个
        //这里直接进行排序，不需要filter进行条件限制
        System.out.println("-----------------------------------------");
        students.stream().sorted(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))).skip(students.size()-2).forEach(System.out::println);

        //找出升高超过168的学生，并且去重
        //同样，这里使用.map方法获得上面升高大于168同学名字的一个遍历。也就是说，通过这个map方法获得一个向学生名字的转换
        //这里使用.distinct方法进行去重
        students.stream().filter(s -> s.getHeight()>168).map(s -> s.getName()).distinct().forEach(System.out::println);

        //使用这个方法需要注意：distinct去重复，在自定义类型对象中(希望内容一样就认为重复，需要将hashCode，equals方法进行重写)
        ///进行数据流的合并操作
        Stream<String> st1=Stream.of("张三","李四");
        Stream<String> st2=Stream.of("张三2","李四2","王五");
        //这里需要使用object类型将合并之后的结果接住
        Stream<Object> allSt=Stream.concat(st1,st2);
        allSt.forEach(System.out::println);
    }
}
