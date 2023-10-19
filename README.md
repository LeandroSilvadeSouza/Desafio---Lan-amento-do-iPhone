# Projeto iPhone

Este projeto implementa um modelo simplificado de um iPhone com funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Cada funcionalidade é representada por uma interface e a classe `iPhone` implementa todas elas.

```
+--------------------------------------+
|              iPhone                  |
|--------------------------------------|
| + ReprodutorMusical                  |
| + AparelhoTelefonico                 |
| + NavegadorInternet                  |
|--------------------------------------|
| + tocar()                            |
| + pausar()                           |
| + selecionarMusica()                 |
| + ligar()                            |
| + atender()                          |
| + iniciarCorreioVoz()                |
| + exibirPagina()                     |
| + adicionarNovaAba()                 |
| + atualizarPagina()                  |
+--------------------------------------+
```

## Funcionalidades

### Reprodutor Musical

- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a reprodução de música.
- `selecionarMusica()`: Permite selecionar uma música para reprodução.

### Aparelho Telefônico

- `ligar()`: Liga o telefone.
- `atender()`: Atende uma chamada telefônica.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet

- `exibirPagina()`: Exibe uma página na Internet.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página na Internet.

## Utilização

A classe `iPhone` contém as implementações dessas funcionalidades de exemplo, onde cada método imprime uma mensagem simples. Você pode personalizar esses métodos com a lógica real das funcionalidades do iPhone.

```java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos...
}