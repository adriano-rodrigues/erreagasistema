package br.com.erreagasistema.model;

import br.com.erreagasistema.config.Config;

import static br.com.erreagasistema.util.ValidaDor.validarNumeroOuExcecao;
import static br.com.erreagasistema.util.ValidaDor.validarStringOuExcecao;

public class FuncionarioProducao extends Colaborador {
    private double valorPorPeca;
    private int quantidade;

    public FuncionarioProducao(int registro, String nome, double valorPorPeca, int quantidade) {
        super(registro, nome);
        validarStringOuExcecao(nome);
        validarNumeroOuExcecao(valorPorPeca);
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa: " + quantidade);
        }
        this.valorPorPeca = valorPorPeca;
        this.quantidade = quantidade;
    }

    @Override
    public double calcularSalario() {
        double bonus = valorPorPeca * quantidade;
        return Config.SALARIO_BASE + bonus;
    }
}