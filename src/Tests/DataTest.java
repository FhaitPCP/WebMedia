package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import model.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataTest {
    private Data data;

    @BeforeEach
    public void setUp() {
        data = new Data(15, 8, 2023); // Exemplo de data
    }

    @Test
    public void testGetDia() {
        // Verifica se o getter do dia retorna o valor correto
        assertEquals(15, data.getDia());
    }

    @Test
    public void testGetMes() {
        // Verifica se o getter do mês retorna o valor correto
        assertEquals(8, data.getMes());
    }

    @Test
    public void testGetAno() {
        // Verifica se o getter do ano retorna o valor correto
        assertEquals(2023, data.getAno());
    }
}
