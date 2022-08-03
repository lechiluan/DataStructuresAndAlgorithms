package Java.core;

import java.lang.reflect.Array;
import java.util.Arrays;

//Data Structure

public class ArrayList<E> implements List<E>
{
    private static int DEFAULT_SIZE = 4;
    private E[] elements;
    private int size;


    public ArrayList() {
        elements = (E[])new Object[DEFAULT_SIZE];
    }

    private Object[] grow() {
        return Arrays.copyOf(this.elements,this.elements.length * 2);
    }

    private void insert(int index, E element){
        if(this.size == this.elements.length) {
            this.elements = (E[]) grow();
        }
        E lastElement = this.getElement(this.size - 1);
        for (int i = this.size - 1 ; i > index; i--) {
            this.elements[i] = this.elements[i-1];
        }
        this.elements[this.size] = lastElement;
        this.elements[index] = element;
        this.size++;
    }

    private E getElement (int index) {
        return (E) this.elements[index] ;
    }

    private void ensureCapacity() {
        if(this.size < this.elements.length / 3)
        {
            this.elements = (E[]) shrink();
        }
    }

    private Object[] shrink() {
        return Arrays.copyOf(this.elements,this.elements.length / 2);
    }

    private void checkIndex(int index){
        if(index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(String.format("Index out of bounds: %d for size: %d", index, this.size));
        }
    }

    private void shift(int index) {
        for(int i= index; i< size-1; i++){
            this.elements[i]=this.elements[i+1];
        }
        this.elements[size-1]=null;
    }

    @Override
    public Boolean add(E element) {
        if (this.size == this.elements.length) {
            this.elements = (E[]) grow();
        }
            this.elements[this.size++] = element;
            return true;
    }

    @Override
    public Boolean add(int index, E element) {
        checkIndex(index);
        insert(index, element);
        return true;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return this.getElement(index);
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldElement = this.getElement(index);
        this.elements[index] =element;
        return oldElement;
    }

    @Override
    public E remove(int index) {
        this.checkIndex(index);
        E element = this.getElement(index);
        this.elements[index] = null;
        this.size--;
        shift(index);
        ensureCapacity();
        return element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Boolean contains(E element) {
        if (this.indexOf(element)!=-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public Boolean isEmpty() {
        return this.size==0;
    }
}