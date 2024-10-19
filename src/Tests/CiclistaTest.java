package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import model.Ciclista;
import model.Data;
import model.Duracao;
import model.Etapa;
import model.Hora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CiclistaTest {
    private Ciclista ciclista1;
    private Ciclista ciclista2;
    private Etapa etapa1;
    private Etapa etapa2;
    private Etapa etapa3;

    @BeforeEach
    public void setUp() {
        etapa1 = new Etapa(1, new Data(15, 8, 2023), new Hora(10, 0, 0), new Duracao(1, 30, 0)); // 1h30m
        etapa2 = new Etapa(2, new Data(16, 8, 2023), new Hora(10, 0, 0), new Duracao(2, 0, 0)); // 2h
        etapa3 = new Etapa(3, new Data(17, 8, 2023), new Hora(10, 0, 0), new Duracao(2, 30, 0)); // 2h30m

        List<Etapa> etapas1 = Arrays.asList(etapa1, etapa2);
        List<Etapa> etapas2 = Arrays.asList(etapa2, etapa3);

        ciclista1 = new Ciclista("Ciclista 1", 1, etapas1);
        ciclista2 = new Ciclista("Ciclista 2", 2, etapas2);
    }

    @Test
    public void testGetNome() {
        // Verifica se o getter do nome retorna o valor correto
        assertEquals("Ciclista 1", ciclista1.getNome());
        assertEquals("Ciclista 2", ciclista2.getNome());
    }

    @Test
    public void testCalcularTempoTotal() {
        // Verifica se o tempo total calculado está correto
        assertEquals("3 horas, 30 minutos e 0 segundos", ciclista1.calcularTempoTotal().toString()); // 1h30m + 2h = 3h30m
        assertEquals("4 horas, 30 minutos e 0 segundos", ciclista2.calcularTempoTotal().toString()); // 2h + 2h30m = 4h30m
    }

    @Test
    public void testCompararTempoComOutro() {
        // Compara o tempo total de dois ciclistas e verifica o vencedor
        assertEquals("Ciclista 1 venceu com um tempo menor: 1 horas, 30 minutos e 0 segundos", ciclista1.compararTempoComOutro(ciclista2));
        assertEquals("Ciclista 1 venceu com um tempo menor: 1 horas, 30 minutos e 0 segundos", ciclista2.compararTempoComOutro(ciclista1));
    }

    @Test
    public void testCompararEtapaComOutro() {
        // Compara o tempo de uma etapa específica entre dois ciclistas
        assertEquals("Ciclista 1 venceu a etapa 1", ciclista1.compararEtapaComOutro(ciclista2, 1));
        assertEquals("Ciclista 2 venceu a etapa 2", ciclista1.compararEtapaComOutro(ciclista2, 2));
        assertEquals("Ambos os ciclistas empataram na etapa 2", ciclista1.compararEtapaComOutro(ciclista2, 2));
    }
}
