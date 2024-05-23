package exercise3.Multithreading.Thread_Pool;

import java.util.concurrent.*;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Pool
 * @Project：study
 * @name：ThreadPoolTest1
 * @Date：23/5/2024 16:46
 * @Filename：ThreadPoolTest1
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        //1.使用构造器创建一个线程池对象
//        public ThreadPoolExecutor( int corePoolSize,
//                                   int maximumPoolSize,
//                                   long keepAliveTime,
//                                   TimeUnit unit,
//                                   BlockingQueue<Runnable> workQueue,
//                                   ThreadFactory threadFactory,
//                                   RejectedExecutionHandler handler)
        //这里的TimeUnit.SECONDS表示存活时间定义为秒。
        //new LinkedBlockingQueue表示基于链表实现，可以无线的加东西进去。new ArrayBlockingQueue表示数组方案，可以控制大小
        //使用Executors.defaultThreadFactor定义一个默认线程工厂
        //使用ThreadPoolExecutor.AbortPolicy定义一个任务拒绝策略(当新线程来了之后，没有办法使用这个新线程时，应该如何拒绝新线程)
        ExecutorService pool=new ThreadPoolExecutor(3,5,8,TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


    }
}
