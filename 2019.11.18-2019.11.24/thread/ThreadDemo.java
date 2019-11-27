package thread;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建Runable接口实现实现对象
        TicketsRunnable t = new TicketsRunnable();
        //创建2个Thread类对象，传递Runnable接口实现类
        Thread t0 = new Thread(t);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t0.start();
        t1.start();
        t2.start();


    }
}
