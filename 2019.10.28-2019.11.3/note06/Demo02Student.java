package note06;
/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

步骤：1.导包；指出需要使用的类在什么位置
      格式；import 包名称.类名称
      对于在同一个包内可以省略导包
      2.创建
      格式；类名称 对象名=new 类名称（）；
           Student stu = new Student();
      3.使用
      对象名.成员变量名
      对象名.成员方法名（参数）
注意；若成员变量没有赋值，将会是默认初始值
*/
public class Demo02Student {
    public static void main(String[] args) {
        //导包可以省略
        Student stu = new Student();//创建

        stu.name="赵丽颖";
        stu.age=22;
        System.out.println(stu.name);//使用成员变量 null
        System.out.println(stu.age);//0

        stu.eat();//使用成员方法
        stu.study();


    }
}
