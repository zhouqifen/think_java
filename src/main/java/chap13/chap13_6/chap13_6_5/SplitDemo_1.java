package chap13.chap13_6.chap13_6_5;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 11:58
 * @Desc
 */
public class SplitDemo_1 {

    public static void main(String[] args){
        String input="This!! unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
