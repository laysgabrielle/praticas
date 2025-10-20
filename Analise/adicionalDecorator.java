public abstract class adicionalDecorator implements Pedido {
    protected Pedido pedidoDecorado;

    public adicionalDecorator(Pedido pedidoDecorado) {
        this.pedidoDecorado = pedidoDecorado;
    }

    @Override
    public String getDescricao() {
        return pedidoDecorado.getDescricao();
    }

    @Override
    public double getPreco() {
        return pedidoDecorado.getPreco();
    }
}