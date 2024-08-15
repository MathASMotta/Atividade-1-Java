package br.com.fiap.controlevetor.models;

public class Filme {
    // Attributes
    private String nome;
    private int anoDeLancamento;
    private double tempoDoFilme;

    // Constructor
    public Filme(String nome, int anoDeLancamento, double tempoDoFilme) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.tempoDoFilme = tempoDoFilme;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getTempoDoFilme() {
        return tempoDoFilme;
    }

    public void setTempoDoFilme(double tempoDoFilme) {
        this.tempoDoFilme = tempoDoFilme;
    }

    // Method toString
    @Override
    public String toString() {
        return "\n Nome do Filme: " + nome + "\n Ano de Lançamento: " + anoDeLancamento + "\n Tempo do Filme: " + tempoDoFilme;
    }

}
