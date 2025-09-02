/*O Bridge é um padrão estrutural.
Ele serve para desacoplar uma abstração da sua implementação, permitindo que os dois evoluam independentemente.
Em vez de misturar tudo numa só classe, criamos uma “ponte” (bridge) entre abstração e implementação. 

Imagine que queremos desenhar formas (círculo, quadrado) em diferentes cores (vermelho, azul).
Sem Bridge → teríamos classes como CirculoVermelho, CirculoAzul, QuadradoVermelho, QuadradoAzul… (explosão de combinações).
Com Bridge → separamos Forma (abstração) de Cor (implementação).
É um padrão estrutural que desacopla a abstração da implementação, permitindo que evoluam separadamente.
Sem Bridge → explosão de classes (ex: CirculoVermelho, CirculoAzul, QuadradoVermelho etc).
Abstração → o que o objeto faz (ex: Forma → desenhar()).
Implementação → como ele faz (ex: Cor → aplicarCor()).
Vantagem: evita duplicação de código e facilita manutenção*/

// Implementação - interface para cores
interface Cor {
    void aplicarCor();
}

// Implementações concretas de Cor
class Vermelho implements Cor {
    public void aplicarCor() {
        System.out.println("Cor vermelha aplicada");
    }
}

class Azul implements Cor {
    public void aplicarCor() {
        System.out.println("Cor azul aplicada");
    }
}

// Abstração - Forma
abstract class Forma {
    protected Cor cor; // ponte para a implementação

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public abstract void desenhar();
}

// Refinar Abstrações - diferentes formas
class Circulo extends Forma {
    public Circulo(Cor cor) {
        super(cor);
    }

    public void desenhar() {
        System.out.print("Desenhando círculo. ");
        cor.aplicarCor();
    }
}

class Quadrado extends Forma {
    public Quadrado(Cor cor) {
        super(cor);
    }

    public void desenhar() {
        System.out.print("Desenhando quadrado. ");
        cor.aplicarCor();
    }
}

// Teste
public class Main {
    public static void main(String[] args) {
        Forma circuloVermelho = new Circulo(new Vermelho());
        Forma quadradoAzul = new Quadrado(new Azul());

        circuloVermelho.desenhar();
        quadradoAzul.desenhar();
    }
}
