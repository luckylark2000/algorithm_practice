package 栈;

public interface stackFunction {
    void destroyStack();
    void clearStack();
    boolean isEmpty();
    int getLength();
    int getTop();
    void push(int e);
    void pop(int e);
    void printAll();
}
