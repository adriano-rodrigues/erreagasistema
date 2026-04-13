package br.com.erreagasistema.util;

public class ValidaDor {

    /**
     * Valida se um número é positivo ou zero.
     * @param valor número a ser validado
     * @return true se for >= 0, false caso contrário
     */
    public static boolean validarNumeroPositivo(double valor) {
        return valor >= 0;
    }

    /**
     * Valida se uma string é não nula e não vazia.
     * @param texto string a ser validada
     * @return true se não for nula nem vazia, false caso contrário
     */
    public static boolean validarString(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    /**
     * Lança exceção se o número for negativo.
     * Útil para cenários onde não basta validar, mas impedir execução.
     * @param valor número a ser validado
     */
    public static void validarNumeroOuExcecao(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo: " + valor);
        }
    }

    /**
     * Lança exceção se a string for nula ou vazia.
     * @param texto string a ser validada
     */
    public static void validarStringOuExcecao(String texto) {
        if (!validarString(texto)) {
            throw new IllegalArgumentException("Texto inválido: " + texto);
        }
    }

    /**
     * ✅ Novo método: valida matrícula/registro como int.
     * - Deve ser um número inteiro >= 0
     * - Se não for número, lança exceção
     */
    public static int validarRegistroOuExcecao(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            throw new IllegalArgumentException("Matrícula não pode ser nula ou vazia");
        }
        try {
            int matricula = Integer.parseInt(entrada.trim());
            if (matricula < 0) {
                throw new IllegalArgumentException("Matrícula não pode ser negativa: " + matricula);
            }
            return matricula;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Matrícula deve ser um número inteiro válido: " + entrada);
        }
    }
}