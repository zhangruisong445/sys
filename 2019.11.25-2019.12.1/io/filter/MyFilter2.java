package io.filter;

import java.io.File;
import java.io.FileFilter;


public class MyFilter2 implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().endsWith(".java");
    }
}
