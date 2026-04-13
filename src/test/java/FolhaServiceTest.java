import org.junit.Test;
import static org.junit.Assert.*;
import br.com.erreagasistema.service.FolhaService;
import br.com.erreagasistema.model.FuncionarioPadrao;

public class FolhaServiceTest {

    @Test
    public void testAdicionarColaborador() {
        FolhaService service = new FolhaService();
        service.adicionarColaborador(new FuncionarioPadrao(1, "João"));
        assertEquals(1, service.getColaboradores().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarColaboradorNull() {
        FolhaService service = new FolhaService();
        service.adicionarColaborador(null);
    }

    // Folha vazia
    @Test
    public void testFolhaVazia() {
        FolhaService service = new FolhaService();
        assertTrue("Folha deve estar vazia inicialmente", service.getColaboradores().isEmpty());
    }
}