package exercise2.IO.File;

public class FileTest5_1 {
    public static void main(String[] args) {

    }

    //直接方法递归
    public static void test1(){
        System.out.println("--test1--");
        test1();//直接方法递归
    }

    //间接方法递归
    public static void test2(){
        System.out.println("--test2--");
        test3();
    }
    public static void test3(){
        test2();//间接递归
    }
}
