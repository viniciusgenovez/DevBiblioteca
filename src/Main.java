import java.util.Scanner;

public class Main {

    void main() {
        Livro jjrt = new Livro();
        jjrt.setTitulo("A queda de Numenor");
        System.out.println(jjrt.getTitulo());
        jjrt.setCodigo("XVYZ164");
        System.out.println(jjrt.getCodigo());
        jjrt.setDisponivel(false);

        Usuario joao = new Usuario();
        joao.nome = "joao";
        jjrt.setDisponivel(false);
        joao.livro = jjrt;
        jjrt.setDisponivel(false);
        joao.livro = null;
        jjrt.setDisponivel(false);

        joao.alocarLivros(jjrt);

        Usuario Caio = new Usuario();
        Caio.nome = "caio";
        jjrt.setDisponivel(false);;

    } //main
} //class