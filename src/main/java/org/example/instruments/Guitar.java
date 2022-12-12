package org.example.instruments;

public class Guitar implements Instrument {
    int numberOfstring;
    Guitar( int numberOfstring ) {
        this.numberOfstring = numberOfstring;
    }
    public void play() {
        System.out.println("Играет гитара "+numberOfstring+" струн");
    }
}
