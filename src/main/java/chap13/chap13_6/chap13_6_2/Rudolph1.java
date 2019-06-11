package chap13.chap13_6.chap13_6_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/6 11:11
 * @Desc
 */
public class Rudolph1 {

    public static void main(String[] args){
        String[] strs = new String[]{"Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*","R.*"};
        for(String patern:strs){
            System.out.println("Rudolph".matches(patern));
        }
    }

}
