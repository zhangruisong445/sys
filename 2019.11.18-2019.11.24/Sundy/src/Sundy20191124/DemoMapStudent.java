package Sundy20191124;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMapStudent {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("张三",13),"巢湖");
        map.put(new Student("李四",14),"合肥");
        map.put(new Student("王五",15),"芜湖");

        Set<Student> set = map.keySet();

        Iterator<Student> it = set.iterator();
        while(it.hasNext()){
            Student key = it.next();
            String value = map.get(key);
            System.out.println(key+"::"+value);
        }
        System.out.println("==============================");
        for (Student key:set){
            String value = map.get(key);
            System.out.println(key+"::"+value);
        }
    }
}
