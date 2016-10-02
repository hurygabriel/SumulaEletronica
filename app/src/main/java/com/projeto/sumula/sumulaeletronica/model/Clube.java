package com.projeto.sumula.sumulaeletronica.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Pedro on 25/09/2016.
 */

public class Clube implements Serializable{

   // private long id;
   // private String dataFundacao;
   // private String nome;
  //  private String fundador;
  //  private String titulos;
  //  private int qtdJogadores;
   // private String UF;
   // private int caminho;
   // private Estadio estadio;
  //  private List<Participacao> participacoes;

    private String dataFundacao;
    private String nome;
    private Estadio estadio;
    private int imagem;

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Clube{" +
                "dataFundacao='" + dataFundacao + '\'' +
                ", nome='" + nome + '\'' +
                ", estadio=" + estadio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clube clube = (Clube) o;

        return nome.equals(clube.nome);

    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
