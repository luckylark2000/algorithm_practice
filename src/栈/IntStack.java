package 栈;

public class IntStack implements stackFunction{
    private int top;
    private int base;
    private int[]space;
    private int Maxsize;
    //构造函数
    public IntStack(int e){
        space=new int[e];
        base=0;
        top=0;
        Maxsize=e;
    }
//    判断是否为空
    public boolean isEmpty(){
        return top-base==0;
    }
    public void destroyStack() {


    }
    public void clearStack() {

    }

    public int getLength() {
        return top-base;
    }
    public int getTop() {
        return space[top];
    }
    public void push(int e) {
        ;
    }
    public void pop(int e) {
        ;
    }
    public void printAll() {
        ;
    }
}
