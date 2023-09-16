package com.designpattern.singletonpattern;

public class Simulator {
    public static void main(String[] args) {
        System.out.println("Simple Singleton");
        System.out.println(SimpleSingleton.getInstance() + " " + SimpleSingleton.getInstance());
        System.out.println("Thread Safe Singleton");
        System.out.println(ThreadSafeSingleton.getInstance() + " " + ThreadSafeSingleton.getInstance());
        System.out.println("Double Check Locking Singleton");
        System.out.println(DoubleCheckedLockingSingleton.getInstance() + " " + DoubleCheckedLockingSingleton.getInstance());
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum);
        System.out.println(singletonEnum.getStr() + " " + singletonEnum.getVal());
    }
}
