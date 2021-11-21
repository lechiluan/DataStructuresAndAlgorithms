package Java.core;

public interface AbstractStack<E> {
    public boolean isEmpty();
    public void push (E element);
    public E pop ();
    public E peek ();
    public int size ();
    public  void traverse();
}

