package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import model.Duracao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DuracaoTest {
    private Duracao duracao;

    @BeforeEach
    public void setUp() {
        duracao = new Duracao(1, 30, 45); // 1 hora, 30 minutos e 45 segundos
    }

    @Test
    public void testToSegundos() {
        // Verifica se a conversão para segundos está correta
        assertEquals(5445, duracao.toSegundos()); // 1h = 3600s, 30m = 1800s, 45s = 45s -> 5445s
    }

    @Test
    public void testFromSegundos() {
        // Verifica se a criação de Duracao a partir de segundos está correta
        Duracao novaDuracao = Duracao.fromSegundos(5445);
        assertEquals(1, novaDuracao.getHoras());
        assertEquals(30, novaDuracao.getMinutos());
        assertEquals(45, novaDuracao.getSegundos());
    }

    @Test
    public void testGetHoras() {
        // Verifica se o getter das horas retorna o valor correto
        assertEquals(1, duracao.getHoras());
    }

    @Test
    public void testGetMinutos() {
        // Verifica se o getter dos minutos retorna o valor correto
        assertEquals(30, duracao.getMinutos());
    }

    @Test
    public void testGetSegundos() {
        // Verifica se o getter dos segundos retorna o valor correto
        assertEquals(45, duracao.getSegundos());
    }

    @Test
    public void testToString() {
        // Verifica se a representação em string está correta
        assertEquals("1 horas, 30 minutos e 45 segundos.", duracao.toString());
    }
}
