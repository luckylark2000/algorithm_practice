package 双向链表;



public class Test {
    public static void main(String[] args){
        DLList dlList=new DLList();
// 测试addToHead（），addToTail（）printAll（）方法
        dlList.addToHead(3);
        dlList.addToTail(5);
        dlList.addToHead(4);
//        dlList.printAll();
// 测试insert(n,e)方法
        dlList.insert(2,9);
//        dlList.printAll();
//测试delete(n)方法
        dlList.delete(dlList.size);
        dlList.printAll();
    }
}
