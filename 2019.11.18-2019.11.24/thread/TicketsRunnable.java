package thread;

public class TicketsRunnable implements Runnable{
    //定义出售的票源数
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            //对票数判断，大于0，可以出售，票数减一
            if(ticket>0)
                System.out.println(Thread.currentThread().getName()+"出售第"+ticket--);
        }

    }
}
