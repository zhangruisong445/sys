package day09;

import java.util.ArrayList;
//群主
public class Manager extends User {

    public Manager(){
    //super();
    }
    public Manager(String name,int money){
        super(name,money);

    }

    public ArrayList<Integer> send(int totaMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();//存储若干个红包

        int leftMoney=super.getMoney();
        if (totaMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney-totaMoney);//群主扣钱

        int avg=totaMoney/count;
        int mod=totaMoney%count;

        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last=avg+mod;
        redList.add(last);

        return redList;
    }
}
