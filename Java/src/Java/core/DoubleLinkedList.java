package Java.core;

public class DoubleLinkedList<E> implements LinkedList<E> {
    private Node<E> head,tail;
    private int size;
    /*Dưa ra ngoai le*/
    private void ensureNomEmpty() {
        if(isEmpty()){
            throw  new StackException("Double Linked List is Empty");
        }
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode= new Node<>(element);
        if(isEmpty()){
            this.head = this.tail = newNode;
        }
        else{
            this.head.previous= newNode;
            newNode.next = this.head;
            this.head=newNode;
        }
        this.size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode= new Node<>(element);
        if(isEmpty()){
            this.head = this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            newNode.previous=this.tail;
            this.tail =newNode;
        }
        this.size++;
    }

    @Override
    public E removeFirst() {
        ensureNomEmpty();//???
        Node<E> oldHead = this.head;
        if(this.size==1) {
            this.head = this.tail= new Node<>(null);
        }
        else{
            this.head = this.head.next;
            this.head.previous = null;
            oldHead.next= null; // if needed
        }
        this.size--;
        return oldHead.getValue();
    }

    @Override
    public E removeLast() {
        ensureNomEmpty();//???
        Node<E> oldHead = this.tail;
        if(this.size==1) {
            this.head = this.tail= new Node<>(null);
        }
        else{
            this.tail = this.tail.previous;
            this.tail.next = null;
            oldHead.previous= null; // if needed
        }
        this.size--;
        return oldHead.getValue();
    }

    @Override
    public E getFirst() {
        return this.head.getValue();
    }

    @Override
    public E getLast() {
        return this.tail.getValue();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public void traverse() {
        if(!isEmpty()){
            Node<E> e =this.head;
            while (e!=null){
                System.out.print((e.getValue()+ " "));
                e = e.next;
            }
        }
    }

    @Override
    public Node<E> getHead() {
        return this.getHead();
    }
}
