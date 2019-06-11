package chap13.chap13_5.chap13_5_3;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 17:10
 * @Desc
 */
public class Turtle_1 {
    private String name;
    private Formatter f;
    public Turtle_1(String name,Formatter f){
        this.f=f;
        this.name=name;
    }

    public void move(int x,int y){
        f.format("%s The Turtle is at (%d %d)\n",name,x,y);
    }

    public static void main(String[] args){
        PrintStream outAlias = System.out;
        Turtle_1 tommy = new Turtle_1("Tommy", new Formatter(System.err));
        Turtle_1 terry = new Turtle_1("Terry", new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);


    }
}
