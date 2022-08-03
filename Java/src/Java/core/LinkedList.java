package Java.core;

//Abstract Data Structure Linked List
public interface LinkedList<E> {
    /* The addFirst function is that it will add to the beginning of the linked list.*/
    public void addFirst(E element);
    /* The addLast function is for appending to the end of a singly linked list.*/
    public void addLast(E element);
    /* The removedFirst function will remove the beginning of the list.*/
    public E removeFirst();
    /* The removeLast function will remove the ending of the list.*/
    public E removeLast();
    /* The getFirst function is to get the first value of the linked list.*/
    public E getFirst();
    /* The getLast function will get the last value of the list. */
    public E getLast();
    /* Return size of list.*/
    public int size ();
    /* Check to list is empty*/
    public boolean isEmpty();
    /* Traverse all elements in List and print value it.*/
    public  void traverse();

    public Node<E> getHead();
 }

