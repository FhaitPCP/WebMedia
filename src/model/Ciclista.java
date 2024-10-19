package model;
import java.util.List;

public class Ciclista {
    private String nome;
    private int numero;
    private List<Etapa> etapas;

    // Construtor
    public Ciclista(String nome, int numero, List<Etapa> etapas) {
        this.nome = nome;
        this.numero = numero;
        this.etapas = etapas;
    }

    // Método getter para o nome
    public String getNome() {
        return nome;
    }

    // Método para calcular o tempo total
    public Duracao calcularTempoTotal() {
        int totalSegundos = 0;

        for (Etapa etapa : etapas) {
            totalSegundos += etapa.getDuracao().toSegundos();
        }

        return Duracao.fromSegundos(totalSegundos);
    }

    // Método para comparar o tempo com outro ciclista
    public String compararTempoComOutro(Ciclista outro) {
        Duracao tempoTotal1 = this.calcularTempoTotal();
        Duracao tempoTotal2 = outro.calcularTempoTotal();

        if (tempoTotal1.toSegundos() < tempoTotal2.toSegundos()) {
            return this.nome + " venceu com um tempo menor: " + tempoTotal1;
        } else if (tempoTotal1.toSegundos() > tempoTotal2.toSegundos()) {
            return outro.getNome() + " venceu com um tempo menor: " + tempoTotal2;
        } else {
            return "Os dois ciclistas têm o mesmo tempo: " + tempoTotal1;
        }
    }

    // Método para comparar uma etapa com outro ciclista
    public String compararEtapaComOutro(Ciclista outro, int numeroEtapa) {
        Etapa minhaEtapa = this.etapas.get(numeroEtapa - 1);
        Etapa etapaDoOutro = outro.etapas.get(numeroEtapa - 1);

        if (minhaEtapa.getDuracao().toSegundos() < etapaDoOutro.getDuracao().toSegundos()) {
            return this.nome + " venceu a etapa " + numeroEtapa;
        } else if (minhaEtapa.getDuracao().toSegundos() > etapaDoOutro.getDuracao().toSegundos()) {
            return outro.getNome() + " venceu a etapa " + numeroEtapa;
        } else {
            return "Ambos os ciclistas empataram na etapa " + numeroEtapa;
        }
    }

    // Método para calcular a diferença de tempo total com outro ciclista
    public Duracao calcularDiferencaTempoComOutro(Ciclista outro) {
        int diferenca = Math.abs(this.calcularTempoTotal().toSegundos() - outro.calcularTempoTotal().toSegundos());
        return Duracao.fromSegundos(diferenca);
    }
}