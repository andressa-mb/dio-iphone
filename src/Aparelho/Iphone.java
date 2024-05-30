package Aparelho;
import AparelhoTelefonico.AparelhoTelefonico;
import Navegador.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
    public void tocar(){
        System.out.println("Tocando música no Iphone");
    }
    public void pausar(){
        System.out.println("Pausando música no Iphone");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música no Iphone: " + musica);
    }

    public void adicionarAba(){
        System.out.println("Adicionando aba no Iphone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página no Iphone");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo página no Iphone: " + url);
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz do Iphone");
    }
    public void ligar(String telefone){
        System.out.println("Ligando do Iphone: " + telefone);
    }
    public void atender(){
        System.out.println("Atendendo chamada do Iphone");
    }
}
