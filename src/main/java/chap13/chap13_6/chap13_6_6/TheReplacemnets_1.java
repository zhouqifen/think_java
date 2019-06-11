package chap13.chap13_6.chap13_6_6;
import net.mindview.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 14:23
 * @Desc
 */
/*! Here's a block of text to use as input to
    the regular  expression matcher.Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the extracted block.!*/
public class TheReplacemnets_1 {
    public static void main(String[] args){
        String s = TextFile.read("D:\\zhouqifen\\study\\code\\think_java\\src\\main\\java\\chap13\\chap13_6\\chap_13_6_6\\TheReplacemnets_1.java");
        //用以下正则表达式匹配以上的注释块
        Pattern p1 = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL);//Pattern.DOTALL表示匹配行终结符,默认其工况下"."表示匹配任意字符,但是不包含行终结符
        Matcher mInput = p1.matcher(s);
        if(mInput.find()){
            s = mInput.group(1);
            System.out.println(s);
        }
        //用一个空格来替换两个或多个空格
        s = s.replaceAll(" {2,}"," ");
        System.out.println(s);
        //在多行的模式下,替换每行开头的空格
        s = s.replaceAll("(?m)^ +","");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]","VOWEL1");
        System.out.println(s);

        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while(m.find()){
            m.appendReplacement(sbuf,m.group().toUpperCase());//把匹配到的字符以及该字符前面的字符串放入sbuf中
            System.out.println(sbuf);
            m.appendTail(sbuf);//把匹配之后的剩余字符串复制到sbuf的后面
            System.out.println(sbuf);

        }
    }

}
