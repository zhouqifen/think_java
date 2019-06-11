package chap13.chap13_5.chap13_5_4;

import java.util.Formatter;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 17:26
 * @Desc
 */
public class Receipt_2 {
    private double total=0;
    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %10s\n","Item","Qty","Price");
        f.format("%-15s %5s %10s\n","----","---","-----");
    }
    public void print(String name,int qty,double price){
        f.format("%-15.15s %5d %10.2f\n",name,qty,price);
        total += price;
    }

    public void printTotal(){
        f.format("%-15s %5s %10.2f\n","Tax","",total*0.06);
        f.format("%-15s %5s %10s\n","","","-----");
        f.format("%-15s %5s %10.2f\n","Total","",total*1.06);

    }
    public static void main(String[] args){
        Receipt_2 receipt = new Receipt_2();
        receipt.printTitle();
        receipt.print("Jack's magic Beans",4,4.25);
        receipt.print("Princess Peas",3,5.1);
        receipt.print("Three Bears Porridge",1,14.29);
        receipt.printTotal();
    }
}
