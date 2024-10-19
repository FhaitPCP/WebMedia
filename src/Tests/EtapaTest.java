package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import model.Data;
import model.Duracao;
import model.Etapa;
import model.Hora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EtapaTest {
    private Etapa etapa;
    private Data data;
    private Hora horaInicial;
    private Duracao duracao;

    @BeforeEach
    public void setUp() {
        data = new Data(15, 8, 2023); // Data exemplo: 15/08/2023
        horaInicial = new Hora(10, 30, 0); // Hora exemplo: 10:30:00
        duracao = new Duracao(2, 45, 0); // Duração exemplo: 2h45m
        etapa = new Etapa(1, data, horaInicial, duracao); // Etapa exemplo
    }

    @Test
    public void testGetNumero() {
        // Verifica se o getter do número retorna o valor correto
        assertEquals(1, etapa.getNumero());
    }

    @Test
    public void testGetData() {
        // Verifica se o getter da data retorna o valor correto
        assertEquals(data, etapa.getData());
    }

    @Test
    public void testGetHoraInicial() {
        // Verifica se o getter da hora inicial retorna o valor correto
        assertEquals(horaInicial, etapa.getHoraInicial());
    }

    @Test
    public void testGetDuracao() {
        // Verifica se o getter da duração retorna o valor correto
        assertEquals(duracao, etapa.getDuracao());
    }
}
