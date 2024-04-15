package exercise.day1;

public class test3 {
    public static void main(String[]args){
        String a="aaaa";
        //长度
        System.out.println(a.length());
        //索引处位置
        char b=a.charAt(1);
        System.out.println(b);
        //遍历字符串
        for(int i=0;i<a.length();i++){
            char x=a.charAt(i);
            System.out.println(x);
        }
        //变成数组之后再进行遍历
        char []shuzu=a.toCharArray();
        for (int i=0;i<a.length();i++){
            System.out.println(shuzu[i]);
        }

        //判断字符串是否一样
        String a1=new String("bbb");
        String a2=new String("ccc");
        System.out.println(a1==a2);
        //忽略大小判断是否一样
        System.out.println(a1.equals(a2));

        //截取字符串
        String b1=a.substring(0,2);
        System.out.println(b1);

        //字符串替换
        String c="错去的";
        String d=c.replace("错","对");
        System.out.println(d);

        //是否包含某个字符串
        String d1="aaaannnnn";
        System.out.println(d1.contains("a"));
        //是否以某个字符开头
        System.out.println(d1.startsWith("n"));

        //按照某个字符分类成为数组中的元素
        String e="caix,uuu,ooo";
        //对逗号进行分割
        String[] shuzu2=e.split(",");
        for(int i=0;i<shuzu2.length;i++){
            System.out.println(shuzu2[i]);
        }
    }
}
