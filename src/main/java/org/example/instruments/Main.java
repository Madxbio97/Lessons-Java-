package org.example.instruments;

public abstract class Main implements Instrument {
    public static void main(String[] args ) {

        Instrument[] musicTools = new Instrument[6];
        musicTools[0] = new Guitar(8);
        musicTools[1] = new Trumphet(25);
        musicTools[2] = new Drum(4);
        musicTools[3] = new Guitar(7);
        musicTools[4] = new Trumphet(20);
        musicTools[5] = new Drum(74);

        for (Instrument a : musicTools) {
            a.play();
        }
    }
}