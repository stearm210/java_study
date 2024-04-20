package exercise1.Object_api;

public class test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //对象克隆：protected Object clone()
        //想使用这个克隆方法，需要进行重写
        User u1=new User(1,"zhangsan","000",new double[]{99.0,99.5});
        //这里是u1的输出
        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());

        //这里是u2的输出
        //使用alt+回车键抛出异常
        User u2=(User)u1.clone();
        System.out.println(u2.getId());
        System.out.println(u2.getUsername());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());
    }
}
