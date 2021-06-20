package 双向链表;

public class Node {
    public int data;
    public Node pre;
    public Node next;
    public Node(int n,Node a,Node b){
        data=n;
        pre=a;
        next=b;
    }
    public Node(int n){
        data=n;
        pre=next=null;
    }
}
