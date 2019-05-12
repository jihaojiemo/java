package com.bittech;

public class TestSequence {

    public static void main(String[] args) {

        ISequence sequence = new MySequenceImpl();
        for(int i = 0; i < 20; i++) {
            sequence.add(i, i);
        }
        sequence.display();
        System.out.println();
        System.out.println(sequence.search(19));
        System.out.println(sequence.contains(18));
        System.out.println(sequence.getPos(3));
        System.out.println(sequence.size());
        sequence.remove(5);
        sequence.display();
        sequence.clear();
        System.out.println();
        sequence.display();
    }
}
