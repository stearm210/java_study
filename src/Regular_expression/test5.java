package Regular_expression;

/*
* 使用正则表达式进行搜索替换，内容分割
* */
public class test5 {
    public static void main(String[] args) {
        //1. public String replaceAll(String regex,String newStr)。使用正则表达式进行替换
        String s1="古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbfsfs42425卡尔扎巴";

        //使用正则表达式将字符串中的非中文字符进行替换，换成“-”
        System.out.println(s1.replaceAll("\\w+", "-"));


        //2. pubilc String[] split(String regex)。使用正则表达式匹配的内容进行分割字符串，返回一个字符串数组。

        String s2="我我我我我我我我喜欢变变变变变变变变";

        /*
        * (.)表示一组：匹配任意字符的
        * \\1:为这个组声明一个组号：1号
        * +：声明必须是重复的字*/
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

    }
}
