package locadora;

public class main {

    public static void main(String[] args) {
        
        Filmes filme1 = new Filmes("Terror" , 1990, 18, true);
        filme1.alugar();

        Terror terror1 = new Terror("Invocação do mal");
        terror1.listarFilmes();
    }
    
}
