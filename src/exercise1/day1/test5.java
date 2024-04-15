package exercise1.day1;

/*
* 字符串用法
* 一般会查询API文档进行编写
* */
public class test5 {
    public static void main(String[] args) {
        //常见方法
        String name="itttt";
        System.out.println(name);

        //newstring方法
        String rs1=new String();
        System.out.println(rs1);

        String rs2=new String("iyyyy");
        System.out.println(rs2);

        //数组方法
        char[] chars={'a','b','c'};
        String rs3=new String(chars);
        System.out.println(rs3);

        //得到对应位置的字符串
        char x=rs3.charAt(1);
        System.out.println(x);

        //字符串的遍历
        for(int i=0;i<rs3.length();i++){
            char k=rs3.charAt(i);
            System.out.println(k);
        }
    }
}
