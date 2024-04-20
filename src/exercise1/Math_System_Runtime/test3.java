package exercise1.Math_System_Runtime;

public class test3 {
    public static void main(String[] args) {
        //通过这个方法得到当前运行时
        Runtime r=Runtime.getRuntime();
        //1.终止当前虚拟机，不建议使用
        //r.exit(0);

        //2.获取当前虚拟机使用的处理器个数
        System.out.println(r.availableProcessors());

        //3.返回java虚拟机中的内存容量
        System.out.println(r.totalMemory()/1024.0/1024.0+"MB");

        //4.返回java虚拟机中空闲的内存容量
        System.out.println(r.freeMemory()/1024.0/1024.0+"MB");

        //5.启动某个程序，里面写一个路径就行
        //Process p=r.exec();
        //Thread.sleep(5000);//程序睡眠一段时间
        //p.destroy();//关闭程序
    }
}
