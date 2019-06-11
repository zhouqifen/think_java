package chap13.chap13_5.chap13_5_6;

import net.mindview.util.BinaryFile;

import java.io.IOException;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 18:04
 * @Desc
 */
public class Hex_2 {
    public static String format(byte[] data){
        StringBuilder result = new StringBuilder();
        int n=0;
        for(byte b:data){
            if(n % 16 == 0){
                result.append(String.format("%04x: ",n));
            }
            result.append(String.format("%02x ",b));
            n++;
            if(n % 16 == 0){
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();

    }
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println(format(BinaryFile.read("D:\\zhouqifen\\study\\code\\think_java\\target\\classes\\chap13\\chap13_5\\chap13_5_6\\Hex_2.class")));
        }
    }
}
