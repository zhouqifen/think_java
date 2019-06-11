package chap13.chap13_7.chap13_7_1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 17:24
 * @Desc
 */
public class ScnanerDelimiter {
    public static void main(String[] args){
        Scanner scanner = new Scanner("12,42,78,99,42");
        scanner.useDelimiter("\\s*,\\s*");
        while(scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
        Pattern delimiter = scanner.delimiter();
    }
}
