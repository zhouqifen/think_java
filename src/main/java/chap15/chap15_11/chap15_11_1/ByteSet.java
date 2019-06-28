package chap15.chap15_11.chap15_11_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 16:03
 * @Desc
 */
public class ByteSet {
    Byte[] possible = {1,2,3,4,5,6,7,8,9};
    Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possible));
   // Set<Byte>  mySet2 = new HashSet<Byte>(Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9));
    ;
}
