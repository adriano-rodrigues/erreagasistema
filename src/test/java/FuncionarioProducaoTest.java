import org.junit.Test;
import static org.junit.Assert.*;
import br.com.erreagasistema.model.FuncionarioProducao;

public class FuncionarioProducaoTest {

    @Test
    public void testCalculoBonusPositivo() {
        FuncionarioProducao f = new FuncionarioProducao(1, "João", 5.0, 100);
        assertEquals(2500.0, f.calcularSalario(), 0.01);
    }

    @Test
    public void testQuantidadeZero() {
        FuncionarioProducao f = new FuncionarioProducao(2, "Maria", 10.0, 0);
        assertEquals(2000.0, f.calcularSalario(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValorPorPecaNegativo() {
        new FuncionarioProducao(3, "Carlos", -5.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuantidadeNegativa() {
        new FuncionarioProducao(4, "Ana", 5.0, -10);
    }


}