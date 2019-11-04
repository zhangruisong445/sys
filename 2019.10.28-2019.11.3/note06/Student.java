package note06;
/*定义一个类，用来模拟“学生”事物；类似结构体和使用结构体；
注意；
  1.成员变量直接定义在类当中的方法外面
  2.成员方法不要写static关键字
 */
public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void study(){
        System.out.println("学习");
    }
}
