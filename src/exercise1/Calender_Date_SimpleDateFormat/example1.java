package exercise1.Calender_Date_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//这是一个判断秒杀订单是否抢到的代码。
public class example1 {
    String start="2023年11月11日 0:0:0";
    String end="2023年11月11日 0:10:0";
    String xj="2023年11月11日 0:01:18";
    String xp="2023年11月11日 0:10:57";

    //字符串时间解析为日期对象
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date starDt=sdf.parse(start);
    Date endDt=sdf.parse(end);
    Date xjDt=sdf.parse(xj);
    Date xpDt=sdf.parse(xp);

    //将日期对象转换为时间毫秒值进行判断
    long startTime=starDt.getTime();
    long endTime=starDt.getTime();

    public example1() throws ParseException {
    }
}
