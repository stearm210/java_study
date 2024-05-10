package exercise2.Logs;

/**
 * @Author：stearm210
 * @Package：exercise2.Logs
 * @Project：study
 * @name：LogsTest1
 * @Date：10/5/2024 15:42
 * @Filename：LogsTest1
 */
public class LogsTest1 {
    public static void main(String[] args) {
        try {
            chu(18,0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void chu(int a,int b){
        int c=a/b;
        System.out.println("结果是:"+c);
    }
}
