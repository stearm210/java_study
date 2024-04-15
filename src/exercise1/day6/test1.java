package exercise1.day6;

public class test1 {
    public static void main(String[] args) {

        /*student s=new student("xxx",10);
        System.out.println(s.toString());
        ArrayList list=new ArrayList();
        list.add("java");
        System.out.println(list);*/
        //构造器先调用父类有参、无参构造器，之后调用子类的有参、无参构造器
        Z z=new Z();
        z.showName();
        z.showMethod();
    }
}
