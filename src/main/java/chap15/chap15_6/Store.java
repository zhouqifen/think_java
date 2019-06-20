package chap15.chap15_6;

import java.util.ArrayList;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 11:31
 * @Desc
 */
public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckOutStand> checkOuts= new ArrayList<CheckOutStand>();
    private Office office = new Office();
    public Store(int nAisle,int nShelves,int nProducts){
        for(int i =0;i<nAisle;i++){}
        add(new Aisle(nShelves,nProducts));
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Aisle a:this){
            for(Shelf s:a){
                for(Product p : s){
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return  result.toString();
    }

    public static void main(String[] args){
        System.out.println(new Store(14,5,10));
    }
}
