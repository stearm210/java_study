package exercise3.Multithreading.Thread_Safety;





/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Safety
 * @Project：study
 * @name：DrawThread
 * @Date：22/5/2024 15:10
 * @Filename：DrawThread
 */

/*
* 取钱操作线程
* */
public class DrawThread extends Thread{
    private Account acc;//使得两个线程处理同一个账户对象
    public DrawThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }
    @Override
    public void run() {
        //取钱
        acc.drawMoney(100000);
    }
}
