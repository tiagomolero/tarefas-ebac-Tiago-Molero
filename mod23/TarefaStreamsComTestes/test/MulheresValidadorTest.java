import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MulheresValidadorTest {

    @Test
    public void isSomenteMulheres() {
        List<Pessoa> listaMulheres = Arrays.asList(
                new Pessoa("Nicole", "feminino"),
                new Pessoa("Andreia", "feminino")
        );
        assertTrue(MulheresValidador.isSomenteMulheres(listaMulheres));
    }
}