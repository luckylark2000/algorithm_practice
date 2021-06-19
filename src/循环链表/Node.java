package 循环链表;

public class Node {
    public int data;
    public Node next;

    public Node(int i, Node n) {
        data = i;
        next = n;
    }

    public Node(int i) {
        data = i;
        next = null;
    }
}
