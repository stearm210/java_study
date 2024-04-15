package exercise.API10;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class test2 {
    public static void main(String[] args) {
        //获得对应时区信息、获取系统默认时区信息
        //创建一个其他地区的默认系统对象
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        //获取java支持的全部时区ID
        System.out.println(ZoneId.getAvailableZoneIds());

        ///把某个时区封装成ZoneId对象
        //封装之后，ZoneDateTime可以调用这个对象获取对应的时间
        ZoneId zoneId1= ZoneId.of("America/Jamaica");


        //ZonedDateTime带时区的时间
        ZonedDateTime now2=ZonedDateTime.now(zoneId1);
        //显示美国时间
        System.out.println(now2);

        //获取世界标准时间
        ZonedDateTime now1=ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        //获取系统的默认时间
        ZonedDateTime now3=ZonedDateTime.now();
        System.out.println(now3);
    }
}
