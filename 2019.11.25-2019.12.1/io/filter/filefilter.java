package io.filter;

import java.io.File;

public class filefilter {


    public static void main(String[] args) {
        File dir = new File("F:\\cs");
        getFilterFiles(dir);

    }

    public static void getFilterFiles (File dir){
        File[] fileArr = dir.listFiles(new MyFilter2());

        for (File f : fileArr){
            if(f.isDirectory()){        //如果是文件夹则递归过滤文件
                getFilterFiles(f);

            }else{
                System.out.println(f);   //如果是过滤后的文件则打印文件名字
            }
        }


    }
}
