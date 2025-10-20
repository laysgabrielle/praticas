package locadora;
import java.util.Date;


import java.util.List;

public class Terror extends Filmes{

    private List<Filmes> filme;

    public Terror (String genero, date ano, int classificacao, boolean alugado, List<Filmes> filme){
        super(genero, ano, classificacao,  alugado);
        this.filme = filme;
    }

    public List<Filmes> getFilme(){
        return filme;
    }

    public void setFilme( List<Filmes> filme){
        this.filme = filme;
    }

    @Override
    public void listarFilmes() {
        super.alugar();
        System.out.println("Do gênero terror, os filmes disponíveis são:");
        for (Filmes f : filme) {
            System.out.println("- " + f.getTitulo()); // Assumindo que a classe Filmes tem getTitulo()
        }
    }
}

