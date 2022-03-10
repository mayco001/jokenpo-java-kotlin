import java.util.Scanner;

public class jokenpoJava {

    public static void main(String[] args) throws InterruptedException {

        int jogador, computador;
        Scanner scan = new Scanner(System.in);

        System.out.println("JO");
        Thread.sleep(900);
        System.out.println("KEN");
        Thread.sleep(900);
        System.out.println("PO");
        Thread.sleep(900);
        System.out.println("----------JOKENPO----------");
        Thread.sleep(800);
        System.out.println("----------------------------");
        System.out.println("1.Pedra | 2.Papel | 3.tesoura");
        System.out.print("Digite a opcão desejada: ");
        jogador = scan.nextInt();

        scan.close();

        //logica do jogador
        switch (jogador) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("Jogador escolheu pedra");
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Jogador escolheu papel");
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Jogador escolheu tesoura");
                break;
            default:
                System.out.println("----------------------------");
                System.out.println("Error");
        }

        //logica do computador
        computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("computador escolheu pedra");
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("computador escolheu papel");
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("computador escolheu tesoura");
                break;
        }

        //logica para determinar o vencedor
        if (jogador == computador){
            System.out.println("----------------------------");
            System.out.println("empate");
        }else if(
                (jogador == 1 && computador == 3) ||
                        (jogador == 2 && computador == 1) ||
                        (jogador == 3 && computador == 2)
        ){
            System.out.println("----------------------------");
            System.out.println("jogador venceu");
        } else {
            System.out.println("----------------------------");
            System.out.println("computador venceu");
        }

    }

}
