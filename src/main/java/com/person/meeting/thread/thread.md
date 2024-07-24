

#创建线程的方式
1. 继承Thread类
2. 实现Runnable接口
3、实现Callable接口
4、使用线程池

#线程的几种状态
1. 新建（new）
2. 运行（runnable）
3. 阻塞（blocked）
4. 死亡（dead）
5. 暂停（suspend）
6。挂起（waiting）
   
#线程的调度
1. 抢占式调度
2. 协作式调度

#线程的死锁
1. 死锁的产生条件
   1. 互斥条件
    2. 请求和保持条件
    3. 不剥夺条件
    4. 循环等待条件
2. 死锁的避免
   1、一次性请求所有资源
   2、设置过期时间
   3、顺序请求资源
3. 死锁的解决
   1、一次性请求所有资源
   2、设置过期时间
   3、顺序请求资源
4. 死锁的检测


# 线程池的执行过程
1. 创建线程池
2. 提交任务
3. 线程池执行任务

核心线程数：核心线程数，默认情况下核心线程数是线程池中常驻的线程数，核心线程数是线程池中一直存活的线程数，核心线程数是线程池中常驻的线程数，核心线程数是线程池中一直存活的线程数。
线程队列：线程队列，默认情况下线程队列是线程池中临时存放任务的队列，线程队列是线程池中临时存放任务的队列。
最大线程数：最大线程数，默认情况下最大线程数是线程池中允许的最大线程数，最大线程数是线程池中允许的最大线程数。
线程存活时间：线程存活时间，默认情况下线程存活时间是线程池中线程空闲时间，线程存活时间是线程池中线程空闲时间。
线程工厂：线程工厂，默认情况下线程工厂是线程池中创建线程的工厂，线程工厂是线程池中创建线程的工厂。
拒绝策略：拒绝策略，默认情况下拒绝策略是线程池中拒绝策略，拒绝策略是线程池中拒绝策略。

#线程池的种类
FixedThreadPool：固定线程池，核心线程数和最大线程数相同，线程队列为无界队列。
CachedThreadPool：缓存线程池，核心线程数和最大线程数相同，线程队列为无界队列。
ScheduledThreadPool：定时线程池，核心线程数和最大线程数相同，线程队列为无界队列。
SingleThreadPool：单线程池，核心线程数和最大线程数相同，线程队列为无界队列。

#J.U.C下面有哪些类
1. CountDownLatch：计数器
2. CyclicBarrier：循环栅栏
3. Semaphore：信号量
4. Exchanger：交换器
5. Executor：执行器
6. ExecutorService：执行服务
7. ScheduledExecutorService：定时执行服务
8. ThreadPoolExecutor：线程池执行器
9. Future：未来
10. FutureTask：未来任务
11. Callable：可执行
12. Runnable：可执行
13. BlockingQueue：阻塞队列
14. LinkedBlockingQueue：链表阻塞队列
15. ArrayBlockingQueue：数组阻塞队列
16. PriorityBlockingQueue：优先级阻塞队列
17. DelayQueue：延迟队列
18. LinkedTransferQueue：链表传输队列
19. LinkedBlockingDeque：链表阻塞双端队列
20. ArrayBlockingDeque：数组阻塞双端队列
21. PriorityBlockingDeque：优先级阻塞双端队列

# AQS
1. AQS是AbstractQueuedSynchronizer的简称，它是J.U.C包下的一个类，它提供了一种线程间协作的方式，通过阻塞和唤醒机制来实现。
2. AQS是J.U.C包下的一个类，它提供了一种线程间协作的方式，通过阻塞和唤醒机制来实现。
   
##AQS在Java内存模型中是如何保证线程安全的？
AQS使用了volatile关键字来保证state变量的可见性，并通过CAS（Compare-And-Swap）操作来保证原子性。



# Atomic 
1. AtomicInteger：原子整数
2. AtomicLong：原子长整数
3. AtomicBoolean：原子布尔值
4. AtomicReference：原子引用
5. AtomicStampedReference：原子戳引用
6. AtomicMarkableReference：原子标记引用
7. AtomicIntegerArray：原子整数数组
8. AtomicLongArray：原子长整数数组
9. AtomicReferenceArray：原子引用数组
10. AtomicIntegerFieldUpdater：原子整数字段更新器
11. AtomicLongFieldUpdater：原子长整数字段更新器

# 线程 和 线程池在实际应用过程中遇到过哪些问题 你是怎么解决的


   
   