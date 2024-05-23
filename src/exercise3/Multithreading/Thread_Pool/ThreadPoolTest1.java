package exercise3.Multithreading.Thread_Pool;

import java.util.concurrent.*;

//使用线程池时，需要创建线程之后，使用线程池对象将线程加入到线程池中。

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

        //2.创建一个Runnable任务类之后再对这个任务类进行使用
        Runnable target=new MyRunnable();
        pool.execute(target);//线程池会自动创建一个新线程，自动处理这个任务
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);//复用之前的线程,帮助执行任务
        //当核心线程被使用完并且任务坑被占满之后，这是会创建临时的线程满足需求。

        pool.shutdown();//线程池的任务全部完成之后才会关闭线程池
        //pool.shutdownNow();//立即关闭线程池
    }
}
