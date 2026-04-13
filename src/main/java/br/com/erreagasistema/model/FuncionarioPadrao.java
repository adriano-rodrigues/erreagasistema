package br.com.erreagasistema.model;

import br.com.erreagasistema.config.Config;

import static br.com.erreagasistema.util.ValidaDor.validarStringOuExcecao;

public class FuncionarioPadrao extends Colaborador {
    public FuncionarioPadrao(int registro, String nome) {
        super(registro, nome);
        validarStringOuExcecao(nome);
    }

    @Override
    public double calcularSalario() {
        return Config.SALARIO_BASE;
    }
}