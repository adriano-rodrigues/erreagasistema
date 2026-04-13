import org.junit.Test;
import static org.junit.Assert.*;
import br.com.erreagasistema.model.FuncionarioPadrao;

public class FuncionarioPadraoTest {

    @Test
    public void testSalarioPadrao() {
        FuncionarioPadrao f = new FuncionarioPadrao(1, "JoaUm");
        assertEquals(2000.0, f.calcularSalario(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNomeInvalido() {
        new FuncionarioPadrao(2, "");
    }
}