import org.junit.Test;
import static org.junit.Assert.*;
import br.com.erreagasistema.model.FuncionarioComissionado;

public class FuncionarioComissionadoTest {

    @Test
    public void testCalculoComissaoPositivo() {
        FuncionarioComissionado f = new FuncionarioComissionado(1, "MarIA", 10000, 10);
        assertEquals(3000.0, f.calcularSalario(), 0.01);
    }

    @Test
    public void testComissaoZero() {
        FuncionarioComissionado f = new FuncionarioComissionado(2, "Carlos", 5000, 0);
        assertEquals(2000.0, f.calcularSalario(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVendasNegativas() {
        new FuncionarioComissionado(3, "Ana", -1000, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPercentualInvalido() {
        new FuncionarioComissionado(4, "Pedro", 1000, 150);
    }

}