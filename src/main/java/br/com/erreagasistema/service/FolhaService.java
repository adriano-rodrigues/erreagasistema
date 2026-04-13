package br.com.erreagasistema.service;

import br.com.erreagasistema.model.Calculavel;
import java.util.ArrayList;
import java.util.List;

public class FolhaService {
    private List<Calculavel> colaboradores = new ArrayList<>();

    public void adicionarColaborador(Calculavel colaborador) {
        if (colaborador == null) {
            throw new IllegalArgumentException("Colaborador não pode ser nulo");
        }
        colaboradores.add(colaborador);
    }

    public void listarFolha() {
        for (Calculavel c : colaboradores) {
            System.out.println("Salário: R$ " + c.calcularSalario());
        }
    }

    // ✅ Getter para testes e outras funcionalidades
    public List<Calculavel> getColaboradores() {
        return colaboradores;
    }
}