package streaming;
import java.util.Date;

public class TestaStreaming{
public static void main(String args []){
    //    public Filme(String nome, int classificacao, String genero)
        Filme f1 = new Filme("Aranha-Verso", 18, "Ação");

    //    public Usuario(String nome, int idade, String sexo){
        Usuario User1 = new Usuario("Erick Garcia", 22, "Masculino");

    //    public Streaming(String nomeFilme, int qtdeUsuarios, Filme filme) {
    
        Streaming st1 = new Streaming("NovaFlix",50000, f1, User1);

    System.out.println(st1.toString());


    }
}   
