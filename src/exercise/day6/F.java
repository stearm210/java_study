package exercise.day6;

public class F {
    public F(){
        System.out.println("父类F的无参构造器");
    }

    public F(String name) {
        this.name = name;
    }

    String name="父类名字";
    public void print1(){
        System.out.println("父类中print1方法的执行");
    }
}
