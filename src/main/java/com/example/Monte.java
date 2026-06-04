package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;

public class Monte {

    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        Naipe[] np = Naipe.values();
        for (int linha = 0; linha < np.length; linha++) {
            Naipe naipe = np[linha];
            for (int coluna = 1; coluna < 14; coluna++) {
                Carta carta = new Carta(coluna, naipe);
                cartas.add(carta);

            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        return cartas.get(0);
    }
}
