public class Chocolate extends adicionalDecorator {
    public Chocolate(Pedido pedidoDecorado) {
        super(pedidoDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Chocolate";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.5; 
    }
}