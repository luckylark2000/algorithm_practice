package 单链表;

public class Main {
    public static void main(String[] args) {

        IntSLList list = new IntSLList();
        list.addToHead(5);
        list.addToHead(3);
        list.addToTail(4);
        list.addToTail(4);
        for (int i = 1; i < 10; i++) {
            list.addToHead(i * i);
        }
        list.printAll();
//        list.deleteFromTail();
//        list.addToHead(9);
//        list.addToHead(9);
//        list.addToHead(9);
//        list.printAll();
//        list.delete(9);
//        list.printAll();
//        int length=list.getLength();
//        list.printAll();
//        System.out.println("单链表元素个数为:"+length);
//        list.getElem(3);
//        list.insertElem(5, 4);
//        list.printAll();

    }
}
