package Java.core;

public class SinglyLinkedList<E> implements LinkedList<E> {
    private Node<E> head; // Create Node<E> head
    private int size; // Create size variable

    public Node<E> getHead() {
        return head;
    }

    /*  Make sure that the Singly linked list is not empty
            if empty throws an exception and exit the program. */
    private void ensureNomEmpty() {
        if(isEmpty()){
            throw  new IllegalStateException("List is Empty!");
        }
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element); // Create a new node to add some Linked List.
        if(!isEmpty()){
            newNode.next =this.head; // If Linked List is not empty then head will be equal to new Node
        }
        this.head = newNode; // Assign new node to be the head of the Linked List
        this.size++; // increase size linked list.
    }


    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element); // Create a new node to add some Linked List.
        if(isEmpty()){
            this.head =newNode; // Assignnew node to be the head of the Linked List
        }
        else{
            Node<E> temp = this.head;  // Create a new node name is Curr equal to head of the Linked list.
            /*Create while loop to find the last position of Linked List. If cur.next runs to the null position,
             then the previous position is the last position of the Linked List*/
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode; // Add newNode into Linked List
        }
        this.size++; // increase size linked list.
    }

    @Override
    public E removeFirst() {
        ensureNomEmpty();// Check that LinkedList is empty
        Node<E> temp = this.head; // Save value needed remove.
        /*If size of Linked List equal 1 then head equal null to unlink old Node.
        *Else, it will assign the head to the previous node oldHead.next */
        if(this.size==1)
        {
            this.head = null;
        }
        else{
            this.head = temp.next;
        }
        this.size--;// reduce size linked list.
        return temp.getValue(); // return value removed
    }

    @Override
    public E removeLast() {
        ensureNomEmpty();// Check that LinkedList is empty
        Node<E> temp = this.head; // Create a new Node is head of Linked List
        if(this.size>1)
        {
            /*If size greater than 1 then
            * Create a while loop to find position last of Linked List */
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            Node<E> oldLast = temp.next; // Save value needed remove.
            temp.next = null; // Unlink old Node.
            this.size--;// reduce size linked list. Because when create while loop have new Node is temp.
            return oldLast.getValue();
        }
        this.head=null;// Head equal null to unlink old Node.
        this.size--; // reduce size linked list.
        return temp.getValue(); // return value removed
    }

    @Override
    public E getFirst() {
        return this.head.getValue(); //Return the first value of Linked List
    }

    @Override
    public E getLast() {
        Node<E> temp = this.head; // Create a new node name is Curr equal to head of the Linked list
        /*Create while loop to find the last position of Linked List. If cur.next runs to the null position,
            then the previous position is the last position of the Linked List*/
        while(temp.next != null)
        {
            temp = temp.next;
        }
        return temp.getValue(); //Return the last value of Linked List
    }

    @Override
    public int size() {
        return this.size; // return size of Linked List
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;// return 1 (true) if Linked List is empty. opposite return 0 (false).
    }

    @Override
    public void traverse() {
        /*Linked list traversal function
        * if Linked List is not empty*/
        if(!isEmpty()){
            Node<E> e =this.head; // create new node equal head of Linked List
            /*Create while loop to run through the entire Linked List
            and print the value of the Linked List. */
            while (e!=null){
                System.out.print((e.getValue()+ " "));
                e = e.next;
            }
        }
    }
}
