public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, String sku, String dataValidade) {
        super(nome, preco, sku); // chama construtor da superclasse
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("dataValidade: " + this.dataValidade);
    }
}
