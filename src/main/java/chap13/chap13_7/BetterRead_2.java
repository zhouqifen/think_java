package chap13.chap13_7;

import java.util.Scanner;

/**
 * @Author: zhouqifen
 * @Date:2019/6/10 17:11
 * @Desc
 */
public class BetterRead_2 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(SimpleRead_1.input);
        System.out.println("What is your name?");
        String name = stdIn.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        int age = stdIn.nextInt();
        double favorite = stdIn.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n",name);
        System.out.format("In 5 years  you will be %d.\n",age+5);
        System.out.format("my favorite dobule is %f.\n",favorite/2);


        

    }
}
