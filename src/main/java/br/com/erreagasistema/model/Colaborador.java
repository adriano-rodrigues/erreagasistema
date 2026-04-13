package br.com.erreagasistema.model;

public abstract class Colaborador implements Calculavel {
    private int registro;
    private String nome;

    public Colaborador(int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public int getRegistro() { return registro; }
    public String getNome() { return nome; }
}