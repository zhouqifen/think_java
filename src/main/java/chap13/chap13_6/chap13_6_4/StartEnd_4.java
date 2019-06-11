package chap13.chap13_6.chap13_6_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zhouqifen
 * @Date:2019/6/6 15:48
 * @Desc
 */
public class StartEnd_4 {

    public static String input=
            "As long as there is injustice,whenever a \n"+
            "Targathian baby cries out, wherever a distress\n"+
            "signal sounds among  the stars ... We'll be there.\n"+
            "This fine ship, and this fine crew ... \n"+
            "Never give up! Never surrender!";
    private static class  Display{
        private boolean regexPrinted=false;
        private String regex;
        Display(String regex){
            this.regex=regex;
        }

        void display(String message){
            if(!regexPrinted){
                System.out.println(regex);
                regexPrinted=true;
            }
            System.out.println(message);

        }
    }

    static void examine(String s,String regex){
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){//find()方法在输入的任意位置与正则表达式进行匹配,匹配成功就会返回false,并会继续往下匹配,直到把输入匹配完
            //start()返回先前的匹配在输入中位置的起始索引 end()返回所匹配的最后字符的索引加一的值
            d.display("find() '"+m.group()+"' start="+m.start()+" end = "+m.end());
        }
        if(m.lookingAt()){//lookingAt()只要输入的第一部分匹配正则表达式就会返回true,也不会再往下匹配
            d.display("lookingAt() '"+m.group()+"' start="+m.start()+" end = "+m.end());
        }
        if(m.matches()){//matches()方法成功的条件是,整个输入都匹配正则表达式,才会返回true,才会匹配成功
            d.display("matches() '"+m.group()+"' start="+m.start()+" end = "+m.end());
        }


    }

    public static void main(String[] args){
        String[] splits = input.split("\n");
        for(String in :splits ){
            System.out.println("input: "+ in);
            for(String regex: new String[]{"\\w*ere\\w*","\\w*ever","T\\w+","Never.*?!"}){
                examine(in,regex);
            }
        }
    }

}
