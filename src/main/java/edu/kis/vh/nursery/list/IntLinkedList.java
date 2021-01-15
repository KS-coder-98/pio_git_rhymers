package edu.kis.vh.nursery.list;

/**
 * Class is template to implement linked list
 */
public class IntLinkedList {
    /**
     * @param last pointer to tail - last elemnt
     * @param i actual index
     */


    Node last;
    int i;

    /**
     * insert element into linked list
     * @param i value of element to insert
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * @return return true if Linked list is Empty or return false when Link list is not empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return return true if Linked list is full or return false when Link list is not full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return top element from LinkedList or -1 when linked list is empty
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     * @return top element from the LinkedList and move the top pointer to the second no of linked list or return -1 when
     * linked list is empty
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
