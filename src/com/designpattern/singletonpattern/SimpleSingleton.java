package com.designpattern.singletonpattern;

public class SimpleSingleton {
    private static SimpleSingleton singleton = null;
    private SimpleSingleton() {

    }

    /**
     * this is not thread safe implementation because of lazy loading, if multiple thread call
     * this method it can produce multiple instances.
     * @return
     */
    public static SimpleSingleton getInstance() {
        if (singleton == null) {
            return singleton = new SimpleSingleton();
        }
        return singleton;
    }
}
