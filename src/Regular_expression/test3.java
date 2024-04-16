package Regular_expression;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        checkEmail();
    }
    public static void checkPhone(){
        ///ctrl+alt+t 三键可以选择循环体
        while (true) {
            System.out.println("输入电话号码:");
            Scanner sc=new Scanner(System.in);
            String phone=sc.nextLine();

            //检验号码
            //手机：18676769999  座机：010-3424242424 0104644535

            //下面这个正则表达式中的“|”表示分开两种情况。前面的情况是手机号码的，后面的情况是座机号码的
            //表达式中的“{}”表示最大长度。“[]”表示可选的数字范围。“-?”表示“-”至多有一个
            if (phone.matches("(1[3-9]\\{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")) {
                System.out.println("正确");
            }else {
                System.out.println("输入错误");
            }
        }
    }
    public static void checkEmail(){
        while (true){
            System.out.println("输入邮箱");
            Scanner sc=new Scanner(System.in);
            String email=sc.nextLine();

            /*
            * dlei009@163.com
            * 2562556256@qq.com
            * */

            // "(\.\w{2,10}){1,2}"这个意思表示这种情况可能会出现一次到两次
            if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("输入邮箱正确");
                break;
            }else {
                System.out.println("输入邮箱失败");
            }
        }
    }
}
