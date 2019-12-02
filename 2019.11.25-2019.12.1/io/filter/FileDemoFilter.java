package io.filter;

import java.io.File;

public class FileDemoFilter {
    public static void main(String[] args) {
        File file = new File("D:\\ideaProjects\\basic-code\\Practise\\src\\io");
        File[] fileArr = file.listFiles(new MyFilter());//文件过滤器MyFilter实现FileFilter接口
        for (File f: fileArr){
            System.out.println(f);
        }
    }
}
