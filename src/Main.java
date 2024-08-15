import br.com.fiap.controlevetor.models.*;


public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando uma lista
        ListaFilmes lista = new ListaFilmes(3);

        // Declarando e inicializando meus filmes
        Filme filme1 = new Filme("John Wick: Capítulo 4", 2023, 2.49);
        Filme filme2 = new Filme("Kingsman: O Círculo Dourado", 2017, 2.21);
        Filme filme3 = new Filme("Coringa", 2019, 2.02);
        Filme filme4 = new Filme("Truque de Mestre", 2013, 1.55);

        // Acionando o método para adicionar itens na minha lista
        System.out.println();
        lista.adicionar(filme1);
        lista.adicionar(filme2);
        lista.adicionar(filme3);
        lista.listar(); // Listando os itens da minha lista

        // Acionando o método para buscar um item na minha lista
        System.out.println();
        lista.buscar("Coringa");
        lista.listar();

        // Acionando o método para atualizar um item da minha lista
        System.out.println();
        lista.atualizar(1, filme4);
        lista.listar();

        // Acionando o método para remover um item da minha lista
        System.out.println();
        lista.remover(0);
        lista.listar();

    }
} 