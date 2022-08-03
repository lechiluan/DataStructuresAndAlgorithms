package Java.core;
//ADT = ADS
public interface List<E> {
    Boolean add(E element);

    Boolean add (int index, E element);

    E get(int index);

    E set (int index, E element);

    E remove (int index);

    int  size();

    int indexOf(E index);

    Boolean contains(E element);

    Boolean isEmpty();
}
