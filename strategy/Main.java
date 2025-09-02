/*O Strategy é um padrão de projeto comportamental.
Ele serve para definir uma família de algoritmos, encapsulá-los em classes diferentes e permitir que sejam usados de forma intercambiável, sem precisar mudar o código do cliente.
Em vez de colocar vários if/else dentro de uma classe, você separa os comportamentos em estratégias diferentes.
Com Strategy → cada tipo de desconto vira uma classe diferente, e o código principal só usa a estratégia escolhida

É um padrão comportamental que encapsula diferentes algoritmos em classes separadas, tornando-os intercambiáveis sem mudar o código principal.
Evita vários if/else, pois cada opção é uma estratégia diferente.
Interface → garante que todas as estratégias tenham o mesmo método (ex: calcularPagamento()), mesmo que cada uma faça de um jeito.
Exemplo: formas de pagamento (Pix, Cartão, Boleto). Cada um é uma estratégia.
Ele usa composição → a classe principal recebe a estratégia como objeto.*/
// Interface Strategy - define o contrato
interface Desconto {
    double calcular(double valor);
}

// Estratégia 1 - Sem desconto
class SemDesconto implements Desconto {
    public double calcular(double valor) {
        return valor;
    }
}

// Estratégia 2 - Desconto de Natal
class DescontoNatal implements Desconto {
    public double calcular(double valor) {
        return valor * 0.9; // 10% de desconto
    }
}

// Estratégia 3 - Desconto de Black Friday
class DescontoBlackFriday implements Desconto {
    public double calcular(double valor) {
        return valor * 0.5; // 50% de desconto
    }
}

// Contexto - usa a estratégia
class Compra {
    private Desconto desconto;

    // Permite mudar a estratégia
    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public void finalizarCompra(double valor) {
        double valorFinal = desconto.calcular(valor);
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}

// Teste
public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();

        // Estratégia 1
        compra.setDesconto(new SemDesconto());
        compra.finalizarCompra(1000);

        // Estratégia 2
        compra.setDesconto(new DescontoNatal());
        compra.finalizarCompra(1000);

        // Estratégia 3
        compra.setDesconto(new DescontoBlackFriday());
        compra.finalizarCompra(1000);
    }
}
