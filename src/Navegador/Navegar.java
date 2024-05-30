package Navegador;

public class Navegar implements NavegadorInternet {
    public void adicionarAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página " + url);
    }

}
