package chap13.chap13_6.chap13_6_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 15:56
 * @Desc
 */
public class Resetting_1 {

    public static void main(String[] args){
        Pattern p = Pattern.compile("[frb][aiu][gx]");
        Matcher m = p.matcher("fix the rug with bags");
        while(m.find()){
            System.out.println(m.group() + " ");
            System.out.println();
           // m.reset("fix the rig with rags");
            m.reset();
            while (m.find()){
                System.out.println(m.group() + " ");
            }
        }
    }
}
