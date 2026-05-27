package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador){
        jogador.receberCarta(monte.virar());
        return null;
    }

    public boolean acabou(){
        return jogador.getPontos() <= 21;
    }

    public String resultado(){
      if()
    }

}
