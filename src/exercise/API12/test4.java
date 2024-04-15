package exercise.API12;

//匿名内部类实现
//局部内部类还是感觉代码太多了，如果简化呢？比如把类名隐藏？匿名内部类就是没有名字的内部类，其必须实现接口或抽象父类的所有抽象方法
public class test4 {
    public static void main(String[] args) {
        //直接使用接口创建所谓的“接口对象”实现匿名内部类
        MathOperation4 addition=new MathOperation4() {
            @Override
            public void operation(int a, int b) {
                System.out.println(a+b);
            }
        };
        addition.operation(1,2);
    }
}

//定义一个函数式接口
interface MathOperation4{
    void operation(int a,int b);
}