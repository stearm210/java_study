package exercise1.API10;

import java.time.Duration;
import java.time.LocalDateTime;

public class test6 {
    public static void main(String[] args) {
        //先创建两个时间对象
        LocalDateTime start=LocalDateTime.of(2025,11,11,11,10,10);
        LocalDateTime end=LocalDateTime.of(2025,11,11,11,11,11);

        //1.得到Duration对象
        Duration duration=Duration.between(start,end);

        //2.获取两个时间对象的信息
        //间隔多少天
        System.out.println(duration.toDays());

        //间隔多少小时
        System.out.println(duration.toHours());
        //间隔多少分
        System.out.println(duration.toMinutes());
        //间隔多少秒
        System.out.println(duration.toSeconds());

    }
}
