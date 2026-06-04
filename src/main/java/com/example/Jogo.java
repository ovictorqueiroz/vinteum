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
        return jogador.getPontos() > 21;
    }

    public String resultado(){
        String mensagem = "";
      if(jogador.getPontos() > 21){
          mensagem =  "Jogador venceu!";
      }else if (computador.getPontos() > 21){
          mensagem = "Computador Venceu!";
      }else {
          int distanciaJogador =  Math.abs(jogador.getPontos() - 21);
          int distanciaComputador =  Math.abs(computador.getPontos() - 21);
          if (distanciaComputador < distanciaJogador){ mensagem = "Computador venceu";}
          else  if (distanciaComputador == distanciaJogador){mensagem = "Empate!";}
          else {mensagem = "Jogador venceu";};

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
