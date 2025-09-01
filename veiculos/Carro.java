public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro (String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    public int getnumeroDePortas(){
        return numeroDePortas;
    }

    public void setnumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("numeros de portas " + this.numeroDePortas);
    }

}