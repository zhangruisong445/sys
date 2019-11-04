package day07;

import java.sql.SQLOutput;
import java.util.ArrayList;

/*
题目：自定义4个学生对象，添加到集合，并遍历。
*/
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one=new Student("张三",20);
        Student two=new Student("李四",21);
        Student three=new Student("王五",18);
        Student four=new Student("钱六",29);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名"+stu.getName()+"年龄"+stu.getAge());

            System.out.println("姓名"+list.get(i).getName()+"年龄"+list.get(i).getAge());
            System.out.println("=========================");

        }
        
    }
}
