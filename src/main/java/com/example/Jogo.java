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
        Carta cartaRecebida = monte.virar();
        jogador.receberCarta(cartaRecebida);

        return cartaRecebida;

    }

    public boolean acabou(){
        return jogador.getPontos() <= 21;
    }

    public String resultado(){
        String mensagem = "";
      if(jogador.getPontos() > Math.abs(jogador.getPontos() - 21)){
          mensagem =  String.format("%s é o vencedor", getJogador());
      }
      return mensagem;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }
}
