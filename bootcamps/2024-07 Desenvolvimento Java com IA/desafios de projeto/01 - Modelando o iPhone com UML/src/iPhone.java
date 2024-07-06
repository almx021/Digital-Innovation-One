import interfaces.*;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
   
    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void ligar(String numero) {
        System.out.println(String.format("Ligando para o número %s", numero));
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void exibirPagina(String url) {
        System.out.println(String.format("Exibindo página %s", url));
    }
}