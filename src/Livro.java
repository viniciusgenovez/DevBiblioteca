public class Livro {

    private String titulo;
    private String codigo;
    private boolean disponivel;

    public Livro(String titulo, boolean disponivel, String codigo) {
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.codigo = codigo;
    } //public class

    public Livro(){
    } //public

    public void setTitulo(String titulo) {

        if (titulo.length() < 2) {
            System.out.println("\n Titulo invalido! insira um titulo com 3 caracteres ou mais. ");
            return;
        } //if
        else {
            System.out.println("\nTitulo valido inserido com sucesso! ");
            this.titulo = titulo;
        } //else

    } //public void

    public String getTitulo() {
        return this.titulo;
    } //public String



    public void setCodigo(String codigo) {

        if (codigo.length() < 2) {
            System.out.println("\n Codigo invalido! insira um codigo valido. ");
            return;
        } //if
        else {
            System.out.println("\nCodigo valido inserido com sucesso! ");
            this.codigo = codigo;
        } //else

    } //public void

    public String getCodigo() {
        return this.codigo;
    } //public String



    public void setDisponivel(boolean disponivel) {

        if (disponivel = false) {
            System.out.println("\nEste livro não está disponivel. ");
            return;
        } //if
        else {
            System.out.println("\nLivro alocado com sucesso!");
            this.disponivel = disponivel;
        } //else

    } //public void

    public boolean getDisponivel() {
        return this.disponivel;
    } //public String

} //class