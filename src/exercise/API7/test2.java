package exercise.API7;

public class test2 {
    public static void main(String[] args) {
        System.exit(0);//人为终止虚拟机，不建议使用

        //返回当前系统的毫秒值
        //一般用于代码的性能分析
        long time=System.currentTimeMillis();
        System.out.println(time);

        //分析代码执行时间
        for (int i = 0; i < 1000; i++) {
            System.out.println("输出"+i);
        }
        long time2=System.currentTimeMillis();
        System.out.println((time2-time)/1000.0+"s");
    }
}
