package chap15.chap15_2.chap15_2_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 17:34
 * @Desc
 */
public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item=null;
            next=null;
        }
        Node(U item,Node<U> next){
            this.item= item;
            this.next=next;
        }
        boolean end(){
            return item == null && next ==null;
        }
    }

    //初始化一个空的top
    private Node<T> top= new Node<T>(); //End sentinel 末端哨兵来判断堆栈何时为空


    public void push(T item){
        top = new Node<T>(item,top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }
    public static void main(String[] args){
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s:"Phasers or stun!".split(" ")){
            lss.push(s);
        }
        String s;
        while((s=lss.pop()) != null){
            System.out.println(s);
        }
    }

}
