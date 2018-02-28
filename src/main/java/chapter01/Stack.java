package chapter01;

/**
 * 下压堆栈（链表实现）
 */
public class Stack<Item> {

    /**
     * 栈顶
     */
    private Node first;

    /**
     * 数量
     */
    private int N;

    /**
     * 节点数据结构
     */
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
