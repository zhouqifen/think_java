package chap13.chap13_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 15:24
 * @Desc
 */
public class WitherStringBuilder_2 {

   /**
    * @Author zhouqifen
    * @Description 这个方法会在循环内构造StringBuilder对象,每循环一次,都会创建一个信息的StringBuilder
    * @Date 2019/6/11 15:37
    * @Param [fields]
    * @return java.lang.String
    **/
    public String implicit(String[] fields){
        String result = "";
        for(int i = 0;i<fields.length;i++){
            result += fields[i];
        }
        return result;
    }

    /**
     * @Author zhouqifen
     * @Description 这个方法在循环外构造StringBuilder,自始至终值狗仔构造一个StringBuilder
     * @Date 2019/6/11 15:38
     * @Param [fields]
     * @return java.lang.String
     **/
    public String explicit(String[] fields){
        StringBuilder result = new StringBuilder();
        for(int i = 0 ;i<fields.length;i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
}
