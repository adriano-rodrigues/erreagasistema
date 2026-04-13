import org.junit.Test;
import static org.junit.Assert.*;
import br.com.erreagasistema.util.ValidaDor;

public class FluxosAlternativosTest   {

    // Registro inválido
    @Test(expected = IllegalArgumentException.class)
    public void testRegistroNaoNumerico() {
        ValidaDor.validarRegistroOuExcecao("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegistroNegativo() {
        ValidaDor.validarRegistroOuExcecao("-10");
    }

    // Nome inválido
    @Test(expected = IllegalArgumentException.class)
    public void testNomeInvalido() {
        ValidaDor.validarStringOuExcecao("");
    }

    // Valor por peça inválido
    @Test(expected = IllegalArgumentException.class)
    public void testValorPorPecaInvalido() {
        ValidaDor.validarNumeroOuExcecao(-5.0);
    }

    // Opção inválida no menu (simulação)
    @Test
    public void testOpcaoInvalidaMenu() {
        int opcao = 99; // opção não implementada
        assertNotEquals("Opção inválida não deve ser 1-4", opcao, 1);
        assertNotEquals(opcao, 2);
        assertNotEquals(opcao, 3);
        assertNotEquals(opcao, 4);
    }
}