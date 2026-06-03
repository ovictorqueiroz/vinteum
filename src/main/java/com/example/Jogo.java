package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador){
        if(jogador.parou()){return null;}
        return jogador.receberCarta(monte.virar());
    }

    public boolean acabou(){
        return jogador.getPontos() <= 21;
    }

    public String resultado(){
      if(jogador.getPontos() > Math.abs(jogador.getPontos() - 21)){
          return String.format("%s é o vencedor", getJogador());
      }
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }
}
