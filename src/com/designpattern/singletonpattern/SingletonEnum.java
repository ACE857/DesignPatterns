package com.designpattern.singletonpattern;

/**
 * An advanced user can change the private access modifier of the constructor to anything they want at runtime
 * using reflection. If this happens, our only mechanism for non-instantiability breaks.
 * Let's see how this can be done. - https://dzone.com/articles/java-singletons-using-enum
 *
 * Enum singleton solves this problem
 */
public enum SingletonEnum {
    INSTANCE;
    int val = 20;
    String str = "bisht";
    private SingletonEnum() {
        System.out.println("Enum singleton constructor");
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
