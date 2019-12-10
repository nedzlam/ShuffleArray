package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Heart");
        lista.add("Cherry");
        lista.add("Coin");
        lista.add("Melon");
        lista.add("Joker");
        Collections.shuffle(lista);
        System.out.print("Shuffle array: " + lista);

    }
}



