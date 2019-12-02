package Sunday20191201;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3_1 {
    public static void main(String[] args) {
        int[] a = new int[3];
        try{
            Scanner sc = new Scanner(System.in);
            for (int i=0;i<3;i++){
                System.out.println("请输入一个整数");
                a[i]= sc.nextInt();

            }

        }catch(InputMismatchException e){
            System.out.println("错误，输入的不是整数");
        }


    }
}
