/*O Adapter é um padrão estrutural.
Ele serve para adaptar uma classe existente (que não é compatível) para uma interface esperada pelo cliente.
Pensa como se fosse um “adaptador de tomada”: você tem um plugue antigo e uma tomada nova, e o adaptador faz a ponte entre eles. 
É um padrão estrutural usado para adaptar interfaces incompatíveis.
Exemplo real: adaptador de tomada (faz o plug de 2 pinos funcionar numa tomada de 3 pinos).
O Adaptador atua como ponte → recebe chamadas da interface esperada e converte para a interface existente.
Pode ser feito com herança ou composição.
Herança: o adaptador estende a classe existente.
Composição: o adaptador contém uma instância da classe existente.*/

// Interface esperada pelo cliente
interface Tomada3Pinos {
    void conectar();
}

// Classe existente (incompatível)
class Tomada2Pinos {
    public void ligar() {
        System.out.println("Dispositivo ligado na tomada de 2 pinos");
    }
}

// Adaptador - faz a ponte entre Tomada3Pinos e Tomada2Pinos
class AdaptadorTomada implements Tomada3Pinos {
    private Tomada2Pinos tomada2Pinos;

    public AdaptadorTomada(Tomada2Pinos tomada2Pinos) {
        this.tomada2Pinos = tomada2Pinos;
    }

    // Adapta o método ligar() para conectar()
    public void conectar() {
        tomada2Pinos.ligar();
    }
}

// Teste
public class Main {
    public static void main(String[] args) {
        Tomada2Pinos dispositivoAntigo = new Tomada2Pinos();
        Tomada3Pinos adaptador = new AdaptadorTomada(dispositivoAntigo);

        // O cliente pensa que está usando uma Tomada3Pinos
        adaptador.conectar();
    }
}

/*Strategy = escolher comportamentos diferentes sem usar if/else.

Bridge = separar abstração e implementação para evitar explosão de classes.

Adapter = fazer interfaces incompatíveis conversarem (tipo um adaptador de tomada */