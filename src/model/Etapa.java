package model;
public class Etapa {
    private int numero;
    private Data data;
    private Hora horaInicial;
    private Duracao duracao;

    // Construtor
    public Etapa(int numero, Data data, Hora horaInicial, Duracao duracao) {
        this.numero = numero;
        this.data = data;
        this.horaInicial = horaInicial;
        this.duracao = duracao;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Data getData() {
        return data;
    }

    public Hora getHoraInicial() {
        return horaInicial;
    }

    public Duracao getDuracao() {
        return duracao;
    }
}