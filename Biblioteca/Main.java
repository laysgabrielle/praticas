public class Main {

    public static void main(String[] args) {

        Livro Livro1 = new Livro ("Para todos os garotos", "Jane aueste", "12/02/2020", true);
        Livro1.emprestar();
        Livro1.devolver();

        Livro Livro2 = new Livro ("Culpa nossa", "oii", "12/02/2020", false);
        Livro2.emprestar();
        Livro2.devolver();
        
    
    }
    
}