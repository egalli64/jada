/*
 * Introduction to Java Collections Framework
 * 
 * https://github.com/egalli64/jcf
 */
package com.example.jada.m2.s02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * JCF interface hierarchy
 */
public class BasicStructure {

    public static void main(String[] args) {
        // A few concrete collections
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeMap<String, String> treeMap = new TreeMap<>();

        /*
         * A concrete List
         */
        // ArrayList is-a List, a collection whose elements are accessible by index
        List<Integer> list = arrayList;

        // List is-a SequencedCollection, a sequenced, reversible collection
        SequencedCollection<Integer> seqColl = list;

        /*
         * A concrete Deque
         */
        // ArrayDeque is-a Deque, a double ended queue, that is also sequenced
        Deque<Integer> deque = arrayDeque;

        // Queue is-a collection that (usually) support the FIFO approach
        Queue<Integer> queue = deque;

        // Deque is-a SequencedCollection, is sequenced and reversible
        seqColl = deque;

        /*
         * A concrete TreeSet
         */
        // TreeSet is-a NavigableSet, a sorted set with extra features
        NavigableSet<Integer> navSet = treeSet;

        // NavigableSet is-a SortedSet, a ordered, sequenced set
        SortedSet<Integer> sortedSet = navSet;

        // SortedSet is-a SequencedSet, a set that is also a sequenced collection
        SequencedSet<Integer> seqSet = sortedSet;

        // SequencedSet is-a Set, a collection with no duplicates
        Set<Integer> set = seqSet;

        // SortedSet is-a Set, a collection with no duplicates
        set = sortedSet;

        /*
         * The topmost JCF interfaces
         */

        // A collection represent a group of objects, usually called elements
        Collection<Integer> coll = seqColl;
        coll = queue;
        coll = set;

        // for-each support
        Iterable<Integer> it = coll;

        /*
         * The Map hierarchy
         */

        // TreeMap is-a NavigableMap, a SortedMap with extra features
        NavigableMap<String, String> navMap = treeMap;

        // NavigableMap is-a SortedMap, a SequencedMap that knows about order
        SortedMap<String, String> sortedMap = navMap;

        // SortedMap is-a SequencedMap, a sequenced, reversible map
        SequencedMap<String, String> seqMap = sortedMap;

        // SequencedMap is-a Map, a key/value mapping
        Map<String, String> map = seqMap;

        System.out.println("An empty iterable: " + it);
        System.out.println("An empty map: " + map);
    }
}
