package org.example.instruments;

public class Trumphet implements Instrument{
    int size;
    Trumphet( int size ) {
        this.size = size;
    }
    public void play() {
        System.out.println("Играет труба с размером "+size);
    }
}
