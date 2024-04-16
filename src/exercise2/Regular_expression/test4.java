package exercise2.Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test4 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        String data="学习java. \n"+
                "电话：18118181818\n"+
                "邮箱：nini@163.com\n"+
                "座机电话：010-90189"+ "热线电话：400-891-9898";


        //下面的带编号的代码都是一种规则可以进行使用
        //1.定义爬取规则
        String regex="(1[3-9]\\\\{9})|(0\\\\d{2,7}-?[1-9]\\\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})"+"|(400-?\\d{3,7}-?\\d{3,7})";

        //2.正则表达式封装成一个Pattern对象
        Pattern pattern=Pattern.compile(regex);

        //3.通过pattern对象获取查找内容的匹配度对象
        Matcher matcher=pattern.matcher(data);

        //定义循环获取信息
        while (matcher.find()){
            String rs=matcher.group();//获取内容
            System.out.println(rs);
        }
    }
}
