package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();//用来存储整副牌

        String[] colors={"♥","♠","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        poker.add("大王");
        poker.add("小王");

        for(String number:numbers){
            for(String color:colors){
                poker.add(color+number);
               // System.out.println(color+number);
            }
        }
        //System.out.println(poker);

        //2.洗牌
        //集合工具类Collection中的方法，static void shuffle（List<?> List）使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);

        //3.发牌
        //定义4个字符集合，用来保存三个玩家和底牌的牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i>=51){
                diPai.add(p);
            }else if (i%3==0){
                play1.add(p);
            }else if (i%3==1){
                play2.add(p);
            }else if (i%3==2){
                play3.add(p);
            }
        }

        //4.看牌
        System.out.println("周润发:"+play1);
        System.out.println("刘德华:"+play2);
        System.out.println("周星驰:"+play3);
        System.out.println("底牌:"+diPai);

    }
}
