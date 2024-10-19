package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import model.Hora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HoraTest {
    private Hora hora;

    @BeforeEach
    public void setUp() {
        hora = new Hora(10, 30, 45); // Exemplo de hora: 10:30:45
    }

    @Test
    public void testGetHora() {
        // Verifica se o getter da hora retorna o valor correto
        assertEquals(10, hora.getHora());
    }

    @Test
    public void testGetMinuto() {
        // Verifica se o getter do minuto retorna o valor correto
        assertEquals(30, hora.getMinuto());
    }

    @Test
    public void testGetSegundo() {
        // Verifica se o getter do segundo retorna o valor correto
        assertEquals(45, hora.getSegundo());
    }
}
