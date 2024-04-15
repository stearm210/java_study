package exercise1.day7;

public class test1 {
    public static void main(String[] args) {
        //1.对象多态
        people p1=new teacher();
        p1.run();//行为多态
        //这里的name最终还是会调用父类中的name
        System.out.println(p1.name);

        people p2=new student();
        p2.run();//行为多态
        System.out.println(p2.name);//这里的name最终还是会调用父类中的name

        //强制类型转换
        //强制将people属性的p1转换为student属性
        student s1=(student) p1;
        /*编译阶段如果有继承或者实现关系就可以进行强制转换，但是有的时候会出错。*/
    }
}
