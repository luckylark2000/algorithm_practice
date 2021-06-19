package 单链表;

public class IntSLList {

    protected IntSLLNode head;
    protected IntSLLNode tail;

    //初始化链表
    public IntSLList() {
        head = tail = null;
    }

    //判断链表是否尾空
    public boolean isEmpty() {
        return head == null;
    }

    //从头部插入结点
    public void addToHead(int e) {
        //       head=new 单链表.IntSLLNode(e,head);//下面两行和这一句等价
        IntSLLNode b = head;
        head = new IntSLLNode(e, b);
        if (tail == null) {
            tail = head;//这是必须的，因为原本初始化为空的时候head和tail是两个独立空节点。这样就可以保证链表是连续的（头和尾之间是相连的）
        }
    }

    //从尾部插入节点
    public void addToTail(int e) {
//        if(!isEmpty()){
//            tail.next=new 单链表.IntSLLNode(e);
//            tail=tail.next;
//        }
//        else head=tail= new 单链表.IntSLLNode(e);这里的方法和下面的等价
        IntSLLNode b = new IntSLLNode(e, null);
        if (!isEmpty()) {
            tail.next = b;
            tail = tail.next;
        } else head = tail = b;//注意这里一定要写head=tail=b不能单独写一个tail,因为原本head和tail是两个节点，这里如果只写一个就把头和尾割裂开来了
    }

    //打印链表
    public void printAll() {
        for (IntSLLNode i = head; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }

    //删除头节点并更新头结点
    public void deleteFromHead() {
        if (!isEmpty()) {
            IntSLLNode b = head;
            head = head.next;
            System.out.println("删除的头节点数据为：" + b.data);
        } else System.out.println("链表为空不能进行删除操作");
    }

    //删除尾结点，并更新尾结点
    public void deleteFromTail() {
        int b = 0;
        if (!isEmpty()) {
            if (head == tail) {//只有一个元素是要单独处理，保证头和尾是一致的
                b = head.data;
                head = tail = null;
            } else {
                for (IntSLLNode i = head; i != null; i = i.next) {
                    if (i.next == tail) {
                        b = i.next.data;
                        i.next = null;
                        tail = i;//之前写成了i=tail
                    }
                }
            }
            System.out.println("删除的表尾元素为：" + b);
        } else System.out.println("链表为空不能进行删除操作");
    }

    //删除链表中所有元素值为e的结点
    public void delete(int e) {
        if (!isEmpty()) {
            if (head == tail) {//只有一个元素是要单独处理，保证头和尾是一致
                if (head.data == e) {
                    head = tail = null;
                    System.out.println("已经将链表中唯一元素" + e + "删除");
                } else System.out.println("链表中没有该元素，不能进行删除操作");


            } else if (head != tail) {
                int flag = 0;
                for (IntSLLNode i = head; i != tail; i = i.next) {
                    if (head.data == e) {
                        deleteFromHead();
                        flag = 1;
                    }
                    if (i.next.data == e) {
                        i.next = i.next.next;
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.println("该链表中没有该元素，无法删除");
                } else System.out.println("已经将所有值为" + e + "的元素删除");
            }
        } else System.out.println("此链表为空，没有任何元素，不能进行删除操作");
    }

    //获取单链表的长度
    public int getLength() {
        int j = 0;
        if (head == tail && head != null) {
            j = 1;
        } else if (head != tail) {
            for (IntSLLNode i = head; i != null; i = i.next) {
                j = j + 1;
            }
        }
        return j;
    }

    //查找链表中第n个元素的值
    public void getElem(int n) {
        if (n > getLength()) {
            System.out.println("索引超出链表大小，不能查询");
        } else if (n < 1) System.out.println("索引小于1，不符合查询范围");
        else if (n > 0 && n < getLength() + 1) {
            int j = 0;
            for (IntSLLNode i = head; i != null; i = i.next) {
                j = j + 1;
                if (j == n) {
                    System.out.println("所查找第" + n + "个元素为：" + i.data);
                }


            }
        }


    }

    //在链表第n个结点插入元素e
    public void insertElem(int n, int e) {
        if (n < 1 || n > getLength() + 1) {
            System.out.println("插入位置超出索引，插入错误");
            return;
        }

        if (head == tail && head == null) {
            addToHead(e);
            System.out.println("成功在第" + n + "位置插入元素：" + e);
            return;
        }
        if (n == 1) {
            addToHead(e);

        }
        if (n == getLength() + 1) {
            addToTail(e);

        }
        int j = 0;
        for (IntSLLNode i = head; j != n - 1; i = i.next) {
            j = j + 1;
            if (j == n - 1) {
                i.next = new IntSLLNode(e, i.next);
            }
        }
        System.out.println("成功在第" + n + "个位置插入元素：" + e);


    }


}
