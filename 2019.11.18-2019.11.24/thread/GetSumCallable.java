package thread;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer> {
    private int a;
    public GetSumCallable(Integer a){
        this.a=a;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 1; i <= a; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
