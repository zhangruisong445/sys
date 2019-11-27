package Sundy20191124;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class Demo2 {
        public static void main(String[] args) {
            Map<Integer, BigInteger> map = new HashMap<>();
            for(int i=1;i<=100;i++){
                map.put(i,f(i));
            }

            Set<Integer> set=map.keySet();
            for(Integer key : set){
                BigInteger value = map.get(key);
                System.out.println(key+"::"+value);
            }
        }
        public static BigInteger f(Integer n){
            if(n==1||n==2) {
                return (new BigInteger("1"));
            }else{
                return (new BigInteger ("f(n-1)+f(n-2)"));
            }


        }
    }


