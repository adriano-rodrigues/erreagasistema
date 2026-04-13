package br.com.erreagasistema.model;

import br.com.erreagasistema.config.Config;

import static br.com.erreagasistema.util.ValidaDor.validarNumeroOuExcecao;
import static br.com.erreagasistema.util.ValidaDor.validarStringOuExcecao;

public class FuncionarioComissionado extends Colaborador {
    private double vendas;
    private double percentual;

    public FuncionarioComissionado(int registro, String nome, double vendas, double percentual) {
        super(registro, nome);
        validarStringOuExcecao(nome);
        validarNumeroOuExcecao(vendas);
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual inválido: " + percentual);
        }
        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {
        double comissao = (vendas * percentual) / 100;
        return Config.SALARIO_BASE + comissao;
    }
}