package chap13.chap13_6.chap13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/6 11:49
 * @Desc
 */
public class TestRegularExpression1 {

    public static void main(String[] args){
        args = new String[]{"abcabcabcdfabc","abc+","(abc)+","(abc){2,}"};
     if(args.length<2) {
         System.out.println("Usage:\njava TestRegularExpression CharacterSequence TestRegularExpression");
         System.exit(0);
     }
         System.out.println("Input: \""+args[0] + "\"");
         for(String arg :args){
             System.out.println("Regular expression: \""+ arg + "\"");
             //pattern对象表示编译后的正则表达式
             Pattern p = Pattern.compile(arg);//arg是正则表达式
             Matcher m = p.matcher(args[0]);
             while(m.find()){
                 System.out.println("Match \"" + m.group()+"\" at position " + m.start()+ "-"+(m.end()-1));
             }
         }

    }
}
