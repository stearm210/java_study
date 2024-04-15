package exercise1.day5;

public class teacher extends people{
    public String name="子类teacher中的变量";

    //方法重写
    @Override
    public void run() {
        System.out.println("老师跑得快");
    }
}
