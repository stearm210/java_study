package exercise2.Exception_handling;
//自定义运行时异常
public class test2 {
    public static void main(String[] args) {
        //需求是保存一个合法的年龄
        try {
            saveAge(23);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            //将异常信息进行打印
            e.printStackTrace();
            System.out.println("底层出现bug");
        }
    }
    public static void saveAge(int age){
        if(age>0 && age<150){
            System.out.println("年龄成功保存"+age);
        }else {
            //建议使用异常告诉编码者是否执行成功
            //throw抛出异常对象
            //throw将异常信息抛到上面去
            throw new AgeIllegalRuntimeException("输出异常"+age);
        }
    }
}
