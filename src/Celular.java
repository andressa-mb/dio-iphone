import Aparelho.Iphone;
import AparelhoTelefonico.AparelhoTelefonico;
import Navegador.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;



public class Celular {
    public static void main(String[] args) throws Exception {
        Iphone ipn = new Iphone();
        NavegadorInternet navegacao = ipn;
        ReprodutorMusical reproducao = ipn;
        AparelhoTelefonico ligacoes = ipn;
        

        navegacao.adicionarAba();
        navegacao.exibirPagina("facebook.com.br");
        navegacao.atualizarPagina();

        reproducao.selecionarMusica("Halo");
        reproducao.tocar();
        reproducao.pausar();

        ligacoes.ligar("22221111");
        ligacoes.iniciarCorreioVoz();
        ligacoes.atender();
        


    }
}
