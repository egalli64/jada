/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jcf.m1.s03;

import java.util.logging.Logger;

/**
 * Inner class smoke test
 */
public class MainInner {
    private static final Logger log = Logger.getGlobal();

    /**
     * Show some inner class features
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Encloser encloser = new Encloser();

        // Won't compile: The type Encloser.InnerPrivate is not visible
//        Encloser.InnerPrivate eipx;

        // however, in some way, we can use an inner private class
        Getter x = encloser.f();
        System.out.println("Accessing a private member of encloser: " + x.getValue());

        // this is safer
        encloser.g();

        // using a local class, it is an implementation detail
        System.out.println("A value from encloser: " + encloser.k());

        log.info("creating and using an inner object");
        Encloser.InnerPublic eip = encloser.new InnerPublic();
        System.out.println("Accessing a private member of encloser: " + eip.getDoubledValue());
    }
}
