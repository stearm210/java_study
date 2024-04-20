package exercise1.Lambda;

//Lambda表达式实现
//因为接口中只有一个方法，方法中只有一块语句，因此可以省略接口和方法，只留下语句实现
public class test5 {
    public static void main(String[] args) {
        MathOperation5 addition=(int a,int b)->{
            System.out.println(a+b);
        };
        //执行计算
        addition.operation(1,2);
    }
}

//定义一个函数式接口
interface MathOperation5{
    void operation(int a,int b);
}