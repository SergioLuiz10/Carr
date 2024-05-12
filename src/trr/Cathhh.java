package trr;

import java.util.Scanner;
import carr.kombe;
import carr.kombe2;
import carr.kombeFot;
import carr.kombe2fot2;

public class Cathhh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro carro:");
        String nomeCarro1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo carro:");
        String nomeCarro2 = scanner.nextLine();

        int chegada = 50;
        kombe c1 = new kombeFot(0);
        kombe2 c2 = new kombe2fot2(0);

        c1.setNome(nomeCarro1);
        c2.setNome2(nomeCarro2);

        while (c1.getVelocidade1() < chegada && c2.getVelocidade2() < chegada) {
            c1.acelerar();
            c2.acelerar2();
            pista(c1, c2, chegada);
        }

        vencedor(c1, c2, chegada);
    }

    public static void vencedor(kombe c1, kombe2 c2, int l_chegada) {
        String nomeCarro1 = c1.getNome();
        String nomeCarro2 = c2.getNome2();

        if (c1.getVelocidade1() == l_chegada && c2.getVelocidade2() == l_chegada) {
            System.out.println("Empate entre " + nomeCarro1 + " e " + nomeCarro2 + "!");
        } else if (c1.getVelocidade1() == c2.getVelocidade2()) {
            System.out.println("Empate entre " + nomeCarro1 + " e " + nomeCarro2 + "!");
        } else if (c1.getVelocidade1() >= l_chegada && c1.getVelocidade1() > c2.getVelocidade2()) {
            System.out.println(nomeCarro1 + " venceu a corrida!");
        } else {
            System.out.println(nomeCarro2 + " venceu a corrida!");
        }
    }

    public static void pista(kombe c1, kombe2 c2, int l_chegada) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int h = 0; h < c1.getVelocidade1(); h++) {
            System.out.print(" ");
        }
        System.out.println(c1.getNome().charAt(0));


        for (int y = 0; y < c2.getVelocidade2(); y++) {
            System.out.print(" ");
        }
        System.out.println(c2.getNome2().charAt(0));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
