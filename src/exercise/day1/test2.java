package exercise.day1;

public class test2 {
    public static void main(String[]args) {
        int x=10;
        int y=30;
        //实例化一个数组对象
        student s=new student();
        //类数组问题
        student[] shuzu=new student[4];
        student s1=new student("cai",10);
        student s2=new student("cai",10);
        for(int i=0;i<2;i++){
            System.out.println(s1.getAge());
            System.out.println(s2.getAge());
        }
        s.cout();
        s.setAge(100);
        int k=s.getAge();
        System.out.println(k);
        s.shuchu(99);
        System.out.println(sum(x,y));
    }
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}

