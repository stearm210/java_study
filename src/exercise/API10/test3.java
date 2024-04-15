package exercise.API10;

import java.time.Instant;

public class test3 {
    public static void main(String[] args) {
        //1.创建一个instant的对象
        Instant now1=Instant.now();

        //2.获取总秒数
        long second=now1.getEpochSecond();
        System.out.println(second);

        //3.不够一秒的纳秒数
        int nano= now1.getNano();
        System.out.println(nano);


        //代码的性能分析等可以使用.now()方法


    }
}
