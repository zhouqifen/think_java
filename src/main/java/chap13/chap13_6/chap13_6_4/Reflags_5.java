package chap13.chap13_6.chap13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 11:46
 * @Desc
 */
public class Reflags_5 {

    public static void main(String[] args){
        //Pattern类里的标记
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher("java has regex\nJava has regex\n" +
                "JAVA has pretty good regular expression\n" +
                "Regular  expression are in java");
        while (m.find()){
            System.out.println(m.group());//group方法只返回已匹配的部分
        }
    }
}
