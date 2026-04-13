import br.com.erreagasistema.util.ValidaDor;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValiDorTest {

    @Test
    public void testValorPositivo() {
        assertTrue(ValidaDor.validarNumeroPositivo(10));
    }

    @Test
    public void testValorZero() {
        assertTrue(ValidaDor.validarNumeroPositivo(0));
    }

    @Test
    public void testValorNegativo() {
        assertFalse(ValidaDor.validarNumeroPositivo(-5));
    }

    @Test
    public void testStringValida() {
        assertTrue(ValidaDor.validarString("João"));
    }

    @Test
    public void testStringVazia() {
        assertFalse(ValidaDor.validarString(""));
    }

    @Test
    public void testStringNula() {
        assertFalse(ValidaDor.validarString(null));
    }
}