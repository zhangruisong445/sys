package day07;

/*
题目：生成6个1~33之间的随机整数，添加到集合，并遍历集合
*/

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r =new Random();
        for(int i=0;i<6;i++){
            int num =r.nextInt(33)+1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
