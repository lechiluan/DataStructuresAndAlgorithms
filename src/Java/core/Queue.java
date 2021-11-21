package Java.core;

public class Queue<E> implements AbstractQueue<E> {
    private Node<E> head;
    private int size;

    public void ensureNonEmpty(){
        if(isEmpty()){
            throw  new IllegalStateException("Queue is Empty");
        }
    }

    @Override
    public void offer(E element) {
        Node<E> newNode = new Node<>(element);
        if(this.head == null){
            this.head = newNode;
        }
        else {
            Node<E> temp = this.head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        this.size++;
    }

    @Override
    public E poll() {
        ensureNonEmpty();
        E element = this.head.getValue();
        if(this.size ==1){
            this.head=null;
        }
        else{
            Node<E> temp = this.head.next;
            this.head.next =null;
            this.head = temp;
        }
        this.size--;
        return element;
    }

    @Override
    public E peek() {
        ensureNonEmpty();
        return this.head.getValue();
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
    public  void  traverse(){
        if(!isEmpty()){
            Node<E> e =this.head;
            while (e!=null){
                System.out.print((e.getValue()+ " "));
                e = e.next;
            }
        }
    }

    public int find(E e){
        int sum =0;
        if(!isEmpty()){
            Node<E> temp =this.head;
            while (temp!=null){
                if(temp.getValue().equals((e)))
                sum++;
                temp = temp.next;
            }
        }
        return sum;
    }
}
