package exercise2.Regular_expression;

public class test2 {
    public static void main(String[] args) {
        //匹配数字
        System.out.println("1".matches("\\d"));

        //匹配汉字
        System.out.println("徐".matches("."));
    }
}
