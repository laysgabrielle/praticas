public class PadariaApp {
    public static void main(String[] args) {
        
        Pedido pedido1 = new Cafe();
        System.out.println("Descrição do Pedido 1: " + pedido1.getDescricao());
        System.out.println("Preço Total do Pedido 1: R$ " + pedido1.getPreco());
        System.out.println("---------------------------------");

        
        Pedido pedido2 = new Cafe();
        pedido2 = new acucar(pedido2);
        pedido2 = new Chocolate(pedido2);
        System.out.println("Descrição do Pedido 2: " + pedido2.getDescricao());
        System.out.println("Preço Total do Pedido 2: R$ " + pedido2.getPreco());
        System.out.println("---------------------------------");
     
        
        Pedido pedido3 = new Cafe();
        pedido3 = new PaoDeQueijo(pedido3);
        pedido3 = new Chocolate(pedido3);
        System.out.println("Descrição do Pedido 3: " + pedido3.getDescricao());
        System.out.println("Preço Total do Pedido 3: R$ " + pedido3.getPreco());
        System.out.println("---------------------------------");
    }
}