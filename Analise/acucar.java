public class acucar extends adicionalDecorator {
    public acucar(Pedido pedidoDecorado) {
        super(pedidoDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Açúcar";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.5; // Custo do açúcar
    }
}