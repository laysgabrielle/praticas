public class ProxyExample {

    // Interface comum
    interface Imagem {
        void exibir();
    }

    // Objeto real
    static class ImagemReal implements Imagem {
        private String arquivo;

        public ImagemReal(String arquivo) {
            this.arquivo = arquivo;
            carregarDoDisco();
        }

        private void carregarDoDisco() {
            System.out.println("Carregando " + arquivo + " do disco...");
        }

        @Override
        public void exibir() {
            System.out.println("Exibindo " + arquivo);
        }
    }

    // Proxy que controla o acesso
    static class ProxyImagem implements Imagem {
        private ImagemReal imagemReal;
        private String arquivo;

        public ProxyImagem(String arquivo) {
            this.arquivo = arquivo;
        }

        @Override
        public void exibir() {
            if (imagemReal == null) {
                imagemReal = new ImagemReal(arquivo);
            }
            imagemReal.exibir();
        }
    }

    public static void main(String[] args) {
        Imagem imagem = new ProxyImagem("foto.png");
        imagem.exibir(); // carrega e exibe
        imagem.exibir(); // só exibe, sem carregar de novo
    }
}
