import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(6);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Adivinhe o número que estou pensendo!");
            int palpite = leitura.nextInt();

            if (palpite < numeroAleatorio){
                System.out.println("O número é maior");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor");
            } else {
                System.out.println("Você acertou!!!!!!!");
                break;
            }
        }
        System.out.println("O número é: " + numeroAleatorio );
    }

}
