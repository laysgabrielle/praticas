public class PaoDeQueijo extends adicionalDecorator {
    public PaoDeQueijo(Pedido pedidoDecorado) {
        super(pedidoDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Pão de Queijo";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3.0; // Custo do pão de queijo
    }
}