package model;
public class Duracao {
    private int horas;
    private int minutos;
    private int segundos;

    // Construtor
    public Duracao(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //Método para converter duração em segundos
    public int toSegundos() {
        return (horas * 3600) + (minutos * 60) + segundos;
    }

    //Método para criar uma Duracao a partir de segundos
    public static Duracao fromSegundos(int totalSegundos) {
        int horas = totalSegundos / 3600;
        totalSegundos %= 3600;
        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        return new Duracao(horas, minutos, segundos);
    }

    // Getters
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public String toString() {
        return horas + " horas, " + minutos + " minutos e " + segundos + " segundos.";
    }
}