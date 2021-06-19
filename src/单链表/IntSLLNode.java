package 单链表;

public class IntSLLNode {
    public int data;
    public IntSLLNode next;

    public IntSLLNode(int i, IntSLLNode n) {
        data = i;
        next = n;
    }

    public IntSLLNode(int i) {
        data = i;
        next = null;
    }
}
