public class Cafe implements Pedido {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}