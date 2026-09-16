public class Usuario {
    String nome;
    int prestigio;
    Livro livro;

    public void alocarLivros(Livro livro) {
        livro.setDisponivel(true);
        this.livro = livro;
        System.out.println("\nOlá " + nome + "! o livro " + livro.getTitulo() + " de código " + livro.getCodigo() + " foi alocado!");
    }
        public void devolverLivro(Livro livro) {
            livro.setDisponivel(false);
            this.livro = livro;
            System.out.println("\\nOlá \" + nome + \"! o livro \" + livro.getTitulo() + \" de código \" + livro.getCodigo()+ \" foi devolvido!");
    } //void
} //class