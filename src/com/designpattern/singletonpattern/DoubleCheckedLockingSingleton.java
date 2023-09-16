package com.designpattern.singletonpattern;

public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton singleton = null;
    private DoubleCheckedLockingSingleton() {

    }

    /**
     * this implementation would drastically reduce performace impact from thread safe implementation
     * with synchronized getInstance block. But this does not work in java 1.4 and earlier versions.
     * @return
     */
    public synchronized static DoubleCheckedLockingSingleton getInstance() {
        if (singleton == null) {
            return singleton = new DoubleCheckedLockingSingleton();
        }
        return singleton;
    }
}
