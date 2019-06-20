package chap15.chap15_6;

import chap15.chap15_4.chap15_4_3.Generator_1;

import java.util.ArrayList;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 11:25
 * @Desc
 */
public class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Generator_1.fill(this,Product.generator,nProducts);
    }
}
