package cn.test_12;

import java.util.LinkedList;

public class MyStack {
    private LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }

    public void add(Object obj) {
        link.addFirst(obj);
    }

    public Object get() {
        return link.removeFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }
}