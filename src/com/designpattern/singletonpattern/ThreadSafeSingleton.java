package com.designpattern.singletonpattern;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton = null;
    private ThreadSafeSingleton() {

    }

    /**
     * this implementation is thread safe, but it degrades application performance if high TPS code
     * access following block.
     * @return
     */
    public synchronized static ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            return singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}
