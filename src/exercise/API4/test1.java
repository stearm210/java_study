package exercise.API4;

public class test1 {
    public static void main(String[] args) {
        //StringBuilder t=new StringBuilder(); 无参构造
        StringBuilder s=new StringBuilder("irllll");//有参数构造

        //1.拼接内容
        s.append(12);
        s.append("iiii");
        s.append(true);

        //支持链式编程
        s.append(999).append("黑马");
        System.out.println(s);

        //2.数据的颠倒
        s.reverse();
        System.out.println(s);

        //3.返回字符串长度
        System.out.println(s.length());

        //4.把StringBuilder对象转变成String类型
        String rs=s.toString();
        System.out.println(rs);

    }
}
