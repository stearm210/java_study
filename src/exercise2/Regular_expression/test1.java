package exercise2.Regular_expression;

//验证qq号码是否正确,常规方法
//qq号码在6-20长度之间，不能以0开头
public class test1 {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("2453524a2929"));
        System.out.println(checkQQ("24535242929"));
    }
    public static boolean checkQQ(String qq){
        //1.判断qq号是否为空
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
            return false;
        }

        //2.判断qq号码中有什么东西，判断是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            //根据索引提取当前字符
            char ch = qq.charAt(i);
            //字符不是数字则违法
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
