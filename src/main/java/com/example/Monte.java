package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {}

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta virar (){
        return cartas.get(0);
    }
}
