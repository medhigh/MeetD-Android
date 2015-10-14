package com.example.medhigh.meetmd.control.keepers;

/**
 * Created by medhigh on 13.10.15.
 */
public class Holder<T> {
    private T object;
    public Holder() {
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
