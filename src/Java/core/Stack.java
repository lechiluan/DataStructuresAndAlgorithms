package Java.core;

/*StackE kế thừa AbstractStack*/

public class Stack<E> implements AbstractStack<E> {
    private Node<E> top;
    private int size;
    private int maxSize = 6;

    public void ensureNonEmpty()
    {
        if(isEmpty()){
            throw  new StackException("Stack is Empty");
        }
    }
    // pop all elements out Stack

    public void clear()
    {
        ensureNonEmpty();
        while(this.size > 0){
            E element = this.top.getValue();
            Node<E> temp = this.top.previous;
            this.top.previous = null;
            this.top = temp;
            this.size--;
        }
    }


    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    //this.top = null;
    //làm clear hộp kẹo




    @Override
    public void push(E element) {
       if (this.size < maxSize) {
           Node<E> newNode = new Node<>(element);
           newNode.previous = top;
           top = newNode;
           this.size++;
       }
        else{
           throw  new StackException("Stack is Full");
        }
    }


//        if(this.size<maxsize){
//            Node<E> newNode = new Node<>(element);
//            newNode.previous = top;
//            top = newNode;
//            this.size++;
//        }
//        else{
//            System.out.println("Stack overflow!!!");
//        }


    // Override là kế thừa từ cha
    // Overloading là hàm chung tên nhưng khac thuoc tính  đưa vào// lấy kẹo


    @Override
    public E pop() {
        ensureNonEmpty();
        E element = this.top.getValue();
        Node<E> temp = this.top.previous;
        this.top.previous = null;
        this.top = temp;
        this.size--;
        return element;
    }


    // lấy già trị của top


    @Override
    public E peek() {
        ensureNonEmpty();
        return this.top.getValue();
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public  void  traverse(){
        if(!isEmpty()){
            Node<E> e =this.top;
            while (e!=null){
                System.out.print((e.getValue()+ " "));
                e = e.previous;
            }
        }
    }
}
