package 单链表;

public class IntCLList {
    protected IntSLLNode head;
    protected IntSLLNode tail;
    protected int size;

    public IntCLList() {
        head = tail = null;
        size = 0;
    }

    public void addToHead(int e) {

        IntSLLNode b = head;
        head = new IntSLLNode(e, b);
        if (size == 0 ) {
            tail = head;
        }
        tail.next = head;
        size=size+1;
//        if (tail == null) {
//            tail = head;//这是必须的，因为原本初始化为空的时候head和tail是两个独立空节点。这样就可以保证链表是连续的（头和尾之间是相连的）
//        }
    }

    public void printAll() {
        if (size == 1) {
            System.out.println(head.data);
            return;
        }
        int j=1;
        for (IntSLLNode i = head; j<size+1; i = i.next) {
            System.out.println(i.data);
            j=j+1;
        }
    }
}
