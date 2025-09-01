public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preco, String sku, int voltagem) {
        super(nome, preco, sku); // chama construtor da superclasse
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // mostra detalhes de Produto
        System.out.println("Voltagem: " + this.voltagem);
    }
}
