package chap13.chap13_6.chap13_6_8;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 16:11
 * @Desc
 */
public class JGrep_1 {

    public static void main(String[] args){
     args = new String[]{"D:\\zhouqifen\\study\\code\\think_java\\src\\main\\java\\chap13\\chap13_6\\chap_13_6_8\\JGrep_1.java","\\b[Ssct]\\w+"};
     if(args.length<2){
         System.out.println("Usage: java  JGrep file regex");
         System.exit(0);
    }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        Matcher m = p.matcher("");
        //TextFile将文件打开,读入所有的行,并把这这些行村存储在一个ArrayList中,TextFile的父类是ArrayList,即TextFile是一个集合类
        TextFile strings = new TextFile(args[0]);
        for(String line : strings){
            m.reset(line);
            while (m.find()){
                System.out.println(index++ +": "+m.group()+": "+m.start());
            }
        }
    }
}
