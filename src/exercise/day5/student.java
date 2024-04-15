package exercise.day5;

public class student extends people{
    public String name="子类student中的变量";

    //方法重写
    @Override
    public void run() {
        System.out.println("学生跑得快");
    }
}
