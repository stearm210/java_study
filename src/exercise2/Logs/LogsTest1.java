package exercise2.Logs;

//使用logback框架

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//info方法将参数放入日志文件中
/**
 * @Author：stearm210
 * @Package：exercise2.Logs
 * @Project：study
 * @name：LogsTest1
 * @Date：10/5/2024 15:42
 * @Filename：LogsTest1
 */
public class LogsTest1 {
    //创建一个logger对象
    //这里使用静态最终类进行对象创建
    public static final Logger LOGGER= LoggerFactory.getLogger("LogBackTest1");//日志对象的名字这里随便设置为一个LogBackTest1
    public static void main(String[] args) {
        try {
            LOGGER.info("chu方法开始执行~~~");
            chu(18,0);
            LOGGER.info("chu方法执行成功~~~");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("chu方法执行失败,出现bug~~~");
        }
    }

    public static void chu(int a,int b){
        //记录程序执行流程，这里使用debug方法
        LOGGER.debug("参数a:"+a);
        LOGGER.debug("参数b:"+b);
        int c=a/b;
        //放入日志中
        LOGGER.info("结果是："+c);
    }
}
