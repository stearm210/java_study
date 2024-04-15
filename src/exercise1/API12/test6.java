package exercise1.API12;

//Lambda表达式实现的再次简化
//Lambda 表达式还可以省略参数类型，因为一行语句，因此可以省略花括号
public class test6 {
    public static void main(String[] args) {
        MathOperation6 addition=(a,b)-> System.out.println(a+b);
        addition.operation(1,2);
    }
}

//定义一个函数式接口
interface MathOperation6{
    void operation(int a,int b);
}