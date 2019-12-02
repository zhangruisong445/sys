package ioWriterRead;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
字符流复制文本文件
FileReader读取目的地数据
FileWriter写入数据到目的地
 */
public class Copy_2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("D:\\a.txt");
            fw = new FileWriter("F:\\a.txt");//文件名后再加,ture为续写文件
            char[] cbuf = new char[1024];
            int len = 0;
            while ((len = fr.read(cbuf)) != -1){
                fw.write(cbuf, 0, len);
                fw.flush();
            }
        }catch (IOException ex){
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        }finally {
            try{
                if (fw!=null)
                    fw.close();
            } catch (IOException e) {
                throw new RuntimeException("释放资源失败");
            }finally{
                try{
                    if (fr!=null)
                        fr.close();
                }catch (IOException ex){
                    throw new RuntimeException("释放资源失败");
                }
            }

        }




    }
}

