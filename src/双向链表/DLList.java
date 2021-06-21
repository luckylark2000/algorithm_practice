package 双向链表;

public class DLList implements function {
    protected Node head;
    protected Node tail;
    protected int size;

    //初始化双向链表
    public DLList() {
        head = tail = null;
        size = 0;
    }

    //  判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //头插法
    public void addToHead(int e) {
        if (isEmpty()) {
            head = tail = new Node(e);
        } else {
            head = new Node(e, null, head);
            head.next.pre = head;//注意这里比较容易忽视：旧头结点一开始为空，你更新了头结点，之前的头结点（也就是新头结点的next）的pre要更新为head.
        }
        size = size + 1;
    }

    //尾插法
    public void addToTail(int e) {
        if (isEmpty()) {
            head = tail = new Node(e);
        } else {
            int j = 0;
            for (Node i = head; j != size; i = i.next) {
                j = j + 1;
                if (j == size) {
                    tail.next = new Node(e, tail, null);
                    tail = tail.next;
                }
            }
        }
        size = size + 1;
    }

    //    打印所有
    public void printAll() {
        if (isEmpty()) {
            System.out.println("双向链表为空");
        } else {
            int j = 0;
            for (Node i = head; j != size; i = i.next) {
                j = j + 1;
                System.out.println(i.data);
            }
        }
    }

    //    在链表的第n个位置插入整数e;
    public void insert(int n, int e) {
        if (n < 1 || n > size + 1) {
            System.out.println("超出插入范围，不能进行插入操作");
            return;
        }
        if (isEmpty() || n == 1) {
            addToHead(e);
            return;
        }
        if (n == size + 1) {
            addToTail(e);
            return;
        }
        int j = 0;
        for (Node i = head; j != n; i = i.next) {
            j = j + 1;
            if (j == n) {
                Node s = new Node(e, i.pre, i);
                i.pre.next = s;
                i.pre = s;
//                i=s;
                size = size + 1;
            }

        }

    }

    //    删除链表的第n个结点
    public void delete(int n) {
        if (isEmpty()) {
            System.out.println("链表为空不能进行删除");
            return;
        }
        if (n < 0 || n > size) {
            System.out.println(("索引超出范围，不能进行删除操作"));
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        int j = 0;
        for (Node i = head; j != n; i = i.next) {
            j = j + 1;

            if (j == n) {
                if (n == 1) {
                    head = head.next;
                    head.pre = null;
                    size = size - 1;
                    break;

                }
                if (n == size) {
                    tail = tail.pre;
                    tail.next = null;
                    size = size - 1;
                    break;

                }
                if (n > 1 && n < size) {
                    i.pre.next = i.next;
                    i.next.pre = i.pre;
                    size=size-1;
                    break;
                }
            }

        }

    }
}
