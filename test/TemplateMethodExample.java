public class TemplateMethodExample {

    // Classe abstrata base
    static abstract class Bebida {
        public final void prepararBebida() {
            ferverAgua();
            adicionarIngredientePrincipal();
            servir();
        }

        private void ferverAgua() {
            System.out.println("Fervendo a água...");
        }

        protected abstract void adicionarIngredientePrincipal();

        private void servir() {
            System.out.println("Servindo na xícara.");
        }
    }

    // Subclasse 1
    static class Cha extends Bebida {
        @Override
        protected void adicionarIngredientePrincipal() {
            System.out.println("Adicionando o chá.");
        }
    }

    // Subclasse 2
    static class Cafe extends Bebida {
        @Override
        protected void adicionarIngredientePrincipal() {
            System.out.println("Adicionando o café.");
        }
    }

    public static void main(String[] args) {
        Bebida cha = new Cha();
        cha.prepararBebida();

        System.out.println();

        Bebida cafe = new Cafe();
        cafe.prepararBebida();
    }
}
