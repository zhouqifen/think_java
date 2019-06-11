package chap13.chap13_6.chap13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/6 15:02
 * @Desc
 */
public class Groups_3 {
    public static final String POEM=
            "Twas  brilling,and the slithy toves\n"+
            "Did gyre and gimble in the wabe.\n"+
             "All mimsy  were  the borogoves,\n"+
             "And the mome raths outgrabe.\n\n"+
             "Beware the Jabberwock ,my son ,\n"+
             "The jaws that bite,the claws that catch.\n"+
             "Beware the Junbjub bird, and shun\n"+
             "The frumious Bandersnatch.";
    public static void main(String[] args){
        Pattern p = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
        Matcher m = p.matcher(POEM);
        System.out.println(m.groupCount());
        while(m.find()){
            System.out.println(m.group());
            System.out.println();
            for(int j=0;j<=m.groupCount();j++){
                System.out.print("["+m.group(j)+"]");
            }
            System.out.println();
        }

    }


}
