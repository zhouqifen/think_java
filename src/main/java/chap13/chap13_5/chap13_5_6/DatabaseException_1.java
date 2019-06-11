package chap13.chap13_5.chap13_5_6;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 17:55
 * @Desc
 */
public class DatabaseException_1 extends  Exception{
    public DatabaseException_1(int transactionId,int queyID,String message){
        super(String.format("(t%d,  q%d) %s",transactionId,queyID,message));

    }
    public static void main(String[] args){
        try {
            throw  new DatabaseException_1(3,7,"Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
