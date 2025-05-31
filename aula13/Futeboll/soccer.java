package Futeboll;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class soccer {

    static private Scanner input = new Scanner(System.in);
    static private int position = 0;
    static private Times[] times = new Times[4]; 
    static private String[] nomesTimes = new String[4];

    static private record Times(
        String time,
        int pont,
        int ganhou,
        int empatou,
        int perdeu
    ) {};

    static private void adcionarTime(String[] nomesTimes) {
        for (String nome : nomesTimes) {
            if (position < times.length) {
                times[position++] = new Times(nome, 0, 0, 0, 0);
            }
        }
    }

    static private void jogos() {
        double timeFirst = 0;
        double timeSecond = 0;
        for (int j = 0; j < position; j++) {

            for (int i = 0; i < position; i++) {
                if ((times[j].time).equalsIgnoreCase(times[i].time)) {
                    continue;
                }
                else {
                    timeFirst = (Math.random() * 10) + 1;
                    timeSecond = (Math.random() * 10) + 1;
                    if (timeFirst > timeSecond) {
                        times[j] = new Times(
                            times[j].time(),
                            times[j].pont() + 3,
                            times[j].ganhou() + 1,
                            times[j].empatou(),
                            times[j].perdeu()
                        );
                        times[i] = new Times(
                            times[i].time(),
                            times[i].pont(),
                            times[i].ganhou(),
                            times[i].empatou(),
                            times[i].perdeu() + 1
                        );
                    }
                    else if (timeFirst == timeSecond) {
                        times[j] = new Times(
                            times[j].time(),
                            times[j].pont() + 1,
                            times[j].ganhou(),
                            times[j].empatou() + 1,
                            times[j].perdeu()
                        );
                        times[i] = new Times(
                            times[i].time(),
                            times[i].pont() + 1,
                            times[i].ganhou(),
                            times[i].empatou() + 1,
                            times[i].perdeu()
                        );
                    }
                    else {
                        times[j] = new Times(
                            times[j].time(),
                            times[j].pont(),
                            times[j].ganhou(),
                            times[j].empatou(),
                            times[j].perdeu() + 1
                        );
                        times[i] = new Times(
                            times[i].time(),
                            times[i].pont() + 3,
                            times[i].ganhou() + 1,
                            times[i].empatou(),
                            times[i].perdeu()
                        );
                    }
                }   
            }
        }
    }

    static private void tabelaView() {
        System.out.printf("\nTabela do Brasileirão");
        
        Times[] tabelaOdenada = Arrays.copyOf(times, position);

        Arrays.sort(tabelaOdenada, Comparator.comparingInt(Times::pont).reversed());

        for (int i = 0; i < tabelaOdenada.length; i++) {
            Times object = tabelaOdenada[i];
            System.out.printf("\n%d - %s | Pontos: %d | Vitórias: %d | Empates: %d | Derrotas: %d", i+1, object.time(), object.pont(), object.ganhou(), object.empatou(), object.perdeu());
        }
    }

    static public void main(String[] args) {
        System.out.printf("\n=== Brasileirão ===");
            for (int i = 0; i < 4; i++) {
                System.out.printf("\nDigite o nome do %d° time: ", i+1);
                nomesTimes[i] = input.nextLine();
            }
        adcionarTime(nomesTimes);
        jogos();
        tabelaView();
    }
}