package io.filter;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("G:\\code");
        getAllDir(dir);

    }
    /*
    定义方法实现目录的全遍历输出
     */
    public static void getAllDir(File dir){
        System.out.println(dir);
        //调用方法listFile（）将目录放在文件类数组中，用增强for循环dir进行遍历
        File[] fileArr = dir.listFiles();
        for(File f : fileArr){
            //判断变量f表示的路径是不是文件夹，是文件夹就递归调用遍历目录，不是就打印输出文件名
            if (f.isDirectory()){
                getAllDir(f);
            }else{
                System.out.println(f);
            }
        }
    }


}
