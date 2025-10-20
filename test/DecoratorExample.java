public class DecoratorExample {

    // Interface comum
    interface Cafe {
        double custo();
    }

    // Componente base
    static class CafeSimples implements Cafe {
        @Override
        public double custo() {
            return 5.0;
        }
    }

    // Classe Decorator base
    static abstract class CafeDecorator implements Cafe {
        protected Cafe cafeDecorado;

        public CafeDecorator(Cafe cafe) {
            this.cafeDecorado = cafe;
        }

        @Override
        public double custo() {
            return cafeDecorado.custo();
        }
    }

    // Decorator concreto 1
    static class ComLeite extends CafeDecorator {
        public ComLeite(Cafe cafe) {
            super(cafe);
        }

        @Override
        public double custo() {
            return super.custo() + 2.0;
        }
    }

    // Decorator concreto 2
    static class ComChocolate extends CafeDecorator {
        public ComChocolate(Cafe cafe) {
            super(cafe);
        }

        @Override
        public double custo() {
            return super.custo() + 3.0;
        }
    }

    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        System.out.println("Café simples: R$" + cafe.custo());

        cafe = new ComLeite(cafe);
        cafe = new ComChocolate(cafe);
        System.out.println("Café com leite e chocolate: R$" + cafe.custo());
    }
}
