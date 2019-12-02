package io.filter;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {


    @Override
    public boolean accept(File pathname) {

        String name = pathname.getName();//得到路径的字符串形式

        return name.endsWith(".java");//字符串以.java结尾返回ture，否则返回false
    }
}
