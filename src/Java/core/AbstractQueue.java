package Java.core;

public interface AbstractQueue<E>{
    /* Inserts an element at the rear of the queue.*/
    public void offer(E element);
    /* Removes and returns the first element of the queue (null if empty)*/
    public E poll();
    /* Returns, but does not remove, the first element of the queue (null if empty).*/
    public E peek();
    /* Returns the number of elements in the queue.*/
    public int size();
    /* Tests whether the queue is empty.*/
    public boolean isEmpty();
    /* Returns and print all values in the queue. */
    public  void traverse();
}
