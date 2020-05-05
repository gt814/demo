package com.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    private static String TEST_STRING = "blablabla";
    public static void main(String[] args) {

        int [] counts = {1000, 10000, 50000, 100000, 200000, 400000};

        System.out.println("Insert in middle.");

        for (int n: counts) {
            System.out.println("\nn:" + n);

            long start = System.currentTimeMillis();
            fillArrayList(n);
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("ArrayList duration:" + (duration));

            long start2 = System.currentTimeMillis();
            fillLinkedList(n);
            long end2 = System.currentTimeMillis();
            long duration2 = end2 - start2;
            System.out.println("LinkedList duration:" + (duration2));

            System.out.println("Duration ratio (Link/Array):" + duration2/duration);
        }

    }

    private static void fillArrayList(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i/2, TEST_STRING);
        }
    }

    private static void fillLinkedList(int n) {
        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            linkedList.add(i/2, TEST_STRING);
        }
    }

}

//    Insert in middle.
//
//        n:1000
//        ArrayList duration:1
//        LinkedList duration:1
//        Duration ratio (Link/Array):1
//
//        n:10000
//        ArrayList duration:2
//        LinkedList duration:49
//        Duration ratio (Link/Array):24
//
//        n:50000
//        ArrayList duration:54
//        LinkedList duration:1172
//        Duration ratio (Link/Array):21
//
//        n:100000
//        ArrayList duration:278
//        LinkedList duration:4513
//        Duration ratio (Link/Array):16
//
//        n:200000
//        ArrayList duration:940
//        LinkedList duration:19237
//        Duration ratio (Link/Array):20
//
//        n:400000
//        ArrayList duration:4507
//        LinkedList duration:106468
//        Duration ratio (Link/Array):23
