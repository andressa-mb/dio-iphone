package AparelhoTelefonico;

public class Chamadas implements AparelhoTelefonico{
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void ligar(String telefone){
        System.out.println("Ligando para: " + telefone);
    }

    public void atender(){
        System.out.println("Atendendo a chamada");
    }
}
