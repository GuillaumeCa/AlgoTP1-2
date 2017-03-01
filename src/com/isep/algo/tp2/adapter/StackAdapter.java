package com.isep.algo.tp2.adapter;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class StackAdapter extends DList implements Stack {

    @Override
    public void push(Object o) {
        insertHead(o);
    }

    @Override
    public Object pop() {
        Object head = getHead();
        removeHead();
        return head;
    }

    @Override
    public Object top() {
        return getHead();
    }
}
