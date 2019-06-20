package chap15.chap15_6;

import java.util.ArrayList;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 11:28
 * @Desc
 */
public class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves,int nProducts){
        for(int i = 0;i <nShelves;i++){
            add(new Shelf(nProducts));
        }
    }
}
