public class iPhone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {

    // Implementação dos métodos da interface reprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    // Implementação dos métodos da interface aparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface navegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na Internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página na Internet");
    }
}