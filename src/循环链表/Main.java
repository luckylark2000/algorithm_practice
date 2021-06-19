package 循环链表;

public class
Main {
    public static void main(String[] args) {
        IntCLList myclist = new IntCLList();
        for (int i = 1; i < 10; i++) {
            myclist.addToHead(i * i);
        }
        myclist.printAll();
        System.out.println(myclist.tail.next.data);
        System.out.println(myclist.head.next.data);

    }
}
