class Livro{
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, String anoPublicacao, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getanoPublicacao(){
        return anoPublicacao;
    }

    public void setanoPublicacao(String anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public boolean disponivel(){
        return disponivel;
    }

    public void setdisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if(disponivel) {
            System.out.println("O livro \"" + titulo + "\" está emprestado e ainda não foi devolvido.");
        } 
         else {
           System.out.println("O livro \"" + titulo + "\" está disponível para empréstimo.");
    }
    }  



}