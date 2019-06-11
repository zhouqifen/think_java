package chap13.chap13_6.chap13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/6 14:22
 * @Desc
 */
public class Finding_2 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher("Evening is full of the linnet's wings");
        while(m.find()){//find方法用来在字符串中查找多个额匹配
            System.out.print(m.group() + " ");

        }
        System.out.println("");
        int i = 0;
        while (m.find(i)){
            System.out.print(m.group()+ " ");
            i++;
        }
        
    }
}
