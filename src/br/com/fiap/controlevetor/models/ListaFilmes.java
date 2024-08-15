package br.com.fiap.controlevetor.models;

public class ListaFilmes {
    // Attributes
    private Filme[] listaDeFilmes;
    private int contadorIndex;

    // Constructor
    public ListaFilmes(int tamanho) {
        listaDeFilmes = new Filme[tamanho];
        contadorIndex = 0;
    }

    // Methods

    // Método para adicionar um item na minha array
    public void adicionar(Filme filme) {
        if (contadorIndex < listaDeFilmes.length) {
            listaDeFilmes[contadorIndex] = filme;
            contadorIndex++;
        } else {
            System.out.println("Sua lista já está cheia. Não foi possível colocar mais um filme!");
        }
    }

    // Método para buscar um item na minha array
    public boolean buscar(String nome) {
        for (int i = 0; i < listaDeFilmes.length; i++) {
            if (listaDeFilmes[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("O filme " + nome + " foi encontrado no índice: " + i);
                return true;
            }
        }

        System.out.println("Filme inexistente na lista!");
        return false;
    }

    // Método para atualizar um item na minha array
    public void atualizar(int index, Filme filme) {
        if (index >= 0 && index < contadorIndex) {
            listaDeFilmes[index] = filme;
            System.out.println("Filme no indice " + index + " foi atualizado!");
        } else {
            System.out.println("Este indice é inválido!");
        }
    }

    // Método para remover um item da minha array
    public void remover(int index) {
        if (index >= 0 && index < contadorIndex) {
            for (int i = index; i < contadorIndex - 1; i++) {
                listaDeFilmes[i] = listaDeFilmes[i + 1];  // Desloca os elementos para a esquerda
            }
            listaDeFilmes[contadorIndex - 1] = null;  // Remove o último elemento
            contadorIndex--;
            System.out.println("Filme removido!");
        } else {
            System.out.println("Este indice é inválido!");
        }
    }

    // Método para listar os itens da minha array
    public void listar() {
        for (int i = 0; i < contadorIndex; i++) {
            System.out.println("indice " + i + ": " + listaDeFilmes[i]);
        }
    }
}
