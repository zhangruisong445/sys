package zifuchuanzifucishu;

import java.util.HashMap;
import java.util.Scanner;

public class ZiFuChuanZiFuCiShu {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.创建Map集合，key是字符中的字符，value是字符个数
        HashMap<Character,Integer> map = new HashMap<>();
        //3.遍历字符串获取每个字符
        for(Character c : str.toCharArray()){
            //使用获取到的字符，去map集合集合判断key是否存在
            if(map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                ++value;
                map.put(c,value);
            }else{
                //key不存在
                map.put(c,1);
            }
        }
        //5.遍历map集合，输出结果
        for(Character key :map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"："+value);
        }

    }
}
