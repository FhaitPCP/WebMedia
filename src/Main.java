//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import model.Ciclista;
import model.Data;
import model.Duracao;
import model.Etapa;
import model.Hora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando Ciclista 1
        System.out.println("Digite o nome do Ciclista 1:");
        String nomeCiclista1 = scanner.nextLine();
        System.out.println("Digite o número do Ciclista 1:");
        int numeroCiclista1 = scanner.nextInt();

        List<Etapa> etapasCiclista1 = adicionarEtapas(scanner);

        Ciclista ciclista1 = new Ciclista(nomeCiclista1, numeroCiclista1, etapasCiclista1);

        // Criando Ciclista 2
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o nome do Ciclista 2:");
        String nomeCiclista2 = scanner.nextLine();
        System.out.println("Digite o número do Ciclista 2:");
        int numeroCiclista2 = scanner.nextInt();

        List<Etapa> etapasCiclista2 = adicionarEtapas(scanner);

        Ciclista ciclista2 = new Ciclista(nomeCiclista2, numeroCiclista2, etapasCiclista2);

        // Exibindo os dados dos ciclistas
        System.out.println("Ciclista 1: " + ciclista1.getNome());
        System.out.println("Tempo total do Ciclista 1: " + ciclista1.calcularTempoTotal());

        System.out.println("Ciclista 2: " + ciclista2.getNome());
        System.out.println("Tempo total do Ciclista 2: " + ciclista2.calcularTempoTotal());

        // Comparando os tempos totais entre os ciclistas
        System.out.println("\nComparação entre os ciclistas:");
        String resultadoComparacao = ciclista1.compararTempoComOutro(ciclista2);
        System.out.println(resultadoComparacao);

        // Comparando quem venceu uma etapa escolhida pelo usuário
        System.out.println("\nDigite o número da etapa que deseja comparar (1-21):");
        int numeroEtapa = scanner.nextInt();
        String vencedorEtapa = ciclista1.compararEtapaComOutro(ciclista2, numeroEtapa);
        System.out.println(vencedorEtapa);

        // Exibindo a diferença de tempo total entre os ciclistas
        Duracao diferencaTempo = ciclista1.calcularDiferencaTempoComOutro(ciclista2);
        System.out.println("\nDiferença de tempo total entre os ciclistas:");
        System.out.println("Horas: " + diferencaTempo.getHoras() + ", Minutos: " + diferencaTempo.getMinutos() + ", Segundos: " + diferencaTempo.getSegundos());
    }

    // Método auxiliar para adicionar as etapas de um ciclista
    private static List<Etapa> adicionarEtapas(Scanner scanner) {
        List<Etapa> etapas = new ArrayList<>();
        System.out.println("Quantas etapas deseja adicionar? (máx: 21):");
        int numeroDeEtapas = scanner.nextInt();

        for (int i = 1; i <= numeroDeEtapas; i++) {
            System.out.println("Etapa " + i + ":");

            System.out.println("Digite o dia da etapa:");
            int dia = scanner.nextInt();
            System.out.println("Digite o mês da etapa:");
            int mes = scanner.nextInt();
            System.out.println("Digite o ano da etapa:");
            int ano = scanner.nextInt();
            Data data = new Data(dia, mes, ano);

            System.out.println("Digite a hora inicial (hora, minuto, segundo) da etapa:");
            int hora = scanner.nextInt();
            int minuto = scanner.nextInt();
            int segundo = scanner.nextInt();
            Hora horaInicial = new Hora(hora, minuto, segundo);

            System.out.println("Digite a duração da etapa (hora, minuto, segundo):");
            int duracaoHora = scanner.nextInt();
            int duracaoMinuto = scanner.nextInt();
            int duracaoSegundo = scanner.nextInt();
            Duracao duracao = new Duracao(duracaoHora, duracaoMinuto, duracaoSegundo);

            etapas.add(new Etapa(i, data, horaInicial, duracao));
        }

        return etapas;
    }
}