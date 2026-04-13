import org.junit.Test;
import static org.junit.Assert.*;
import br.com.erreagasistema.util.ValidaDor;

public class ValidaDorRegistroTest {

    @Test
    public void testRegistroValida() {
        assertEquals(123, ValidaDor.validarRegistroOuExcecao("123"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegistroNegativa() {
        ValidaDor.validarRegistroOuExcecao("-5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegistroNaoNumerica() {
        ValidaDor.validarRegistroOuExcecao("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegistroVazia() {
        ValidaDor.validarRegistroOuExcecao("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegistroNula() {
        ValidaDor.validarRegistroOuExcecao(null);
    }
}
