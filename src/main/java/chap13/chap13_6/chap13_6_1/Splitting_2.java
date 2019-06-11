package chap13.chap13_6.chap13_6_1;

import java.util.Arrays;

/**
 * @Author: zhouqifen
 * @Date:2019/5/28 11:11
 * @Desc
 */
public class Splitting_2 {

    public static String knight="Then ,when you found the shrubbery, you must cut down " +
            "the mightiest tree in the forest...with a herring!";
    public static void split(String regex){
        System.out.println(Arrays.toString(knight.split(regex)));
    }
    public static void main(String[] args){
      split(" ");//以空格进行分割 (以普通的字符作为正则表达式)
      split("\\W+");//以非单词字符进行分割
      split("n\\W+");//以字母n后面跟着一个或多个非单词字符进行分割

    }

}
