import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] vetor= new int[10];

        for(int i = 0; i < vetor.length; i++){

          vetor[i] = (int) (Math.random() * 10);
          System.out.print(STR."\{vetor[i]} ");
        }

        System.out.println("\nDigite o número que deseja encontrar: ");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
        boolean encontrado = false;


        for (int i = 0; i < vetor.length; i++){

            if(vetor[i] == buscado){

                encontrado = true;
                break;
            }
        }

        if(encontrado) {

            System.out.println("Valor encontrado!");
        }

        else {

            System.out.println("Valor não encontrado.");
        }
    }
}
