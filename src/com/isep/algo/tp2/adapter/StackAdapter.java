package com.isep.algo.tp2.adapter;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class StackAdapter<T> extends DList<T> implements Stack<T> {

    @Override
    public void push(T o) {
        insertHead(o);
    }

    @Override
    public T pop() {
        T head = getHead();
        removeHead();
        return head;
    }

    @Override
    public T top() {
        return getHead();
    }
}
