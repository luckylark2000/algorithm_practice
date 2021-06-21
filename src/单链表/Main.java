package 单链表;

public class Main {
    public static void main(String[] args) {

        IntSLList list1 = new IntSLList();
//        list.addToHead(5);
//        list.addToHead(3);
//        list.addToTail(4);
//        list.addToTail(4);
        for (int i = 6; i >0; i--) {
            list1.addToHead(i * i);
        }
        list1.printAll();
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
        IntSLList list2=new IntSLList();
        for (int i = 20; i >0; i--) {
            list2.addToHead(i*2 );
        }
        list2.printAll();
        list1=merge2to1(list1,list2);
        list1.printAll();
    }
//    将两个递增的单链表合称为一个递增的单链表（将list2合并到list1里面去），合成后的单链表不能有相同的元素
    public static IntSLList merge2to1(IntSLList list1,IntSLList list2){
        int i=1;

        for(IntSLLNode m=list2.head;i< list2.size+1;m=m.next){
            if(m.data>list1.tail.data){//如果表二的现在结点比表一的尾结点的元素值大，那么直接把元素加到表一的表位
                list1.addToTail(m.data);
                i=i+1;
                continue;
            }
            int j=1;
            for(IntSLLNode n=list1.head;j< list1.size+1;n=n.next){
                if(m.data==n.data){
                    break;//注意这里要用break而不是continue
                }
                if (m.data < n.data) {
                    list1.insertElem(j,m.data);
                    break;
                }
                j=j+1;
                }
            i=i+1;
            }

        return list1;

    }


}
