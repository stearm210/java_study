package exercise1.API1;

public class test1 {
    public static void main(String[] args) {
        Student s1=new Student("冲冲冲",23);
        //这里的toString调用了一个重写方法，其实可以不需要进行重写
        System.out.println(s1.toString());
        System.out.println(s1);
        //比较两个对象的地址是否一样
        Student s2=new Student("照面",22);
        System.out.println(s2.equals(s1));

    }
}
