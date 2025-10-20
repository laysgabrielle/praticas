package locadora;

import java.sql.Date;

public class Filmes{
    private String genero;
    private Date ano;
    private int classificacao;
    private boolean alugado;

    public Filmes(String genero, Date ano, int classificacao,  boolean alugado){
        this.genero = genero;
        this.ano = ano;
        this.classificacao = classificacao;
        this.alugado = false;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }

    public Date getAno(){
        return ano;
    }

    public void setAno(Date ano){
        this.ano = ano;
    }

    public int getClassificacao(){
        return classificacao;
    }

    public void setClassificacCo(int classificacao){
        this.classificacao = classificacao;
    }


    public void alugar(){
        if (!alugado){
            System.out.println("Filme disponivel para alugar");
        }
        else{
            System.out.println("Filme oculpado");
        }
    }

   
    





}