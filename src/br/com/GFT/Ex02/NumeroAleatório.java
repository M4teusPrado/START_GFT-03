package br.com.GFT.Ex02;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatório {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero = random.nextInt(11),  numeroUsuario = 0;

        while(true)  {

            // Recebe valor do usuario
            System.out.printf("Digite um numero \n");
            numeroUsuario = Integer.parseInt(scanner.nextLine());

            // Verifica se o numero input do usuario é igual ao numero gerado
                // True = Quebra o laço de repetição
                // False = O usuario recebe a mensagem, solicitando uma nova tentativa
            if(numero == numeroUsuario) break;
            else System.out.printf("Tente outro numero!\n");
        }

        System.out.printf("voce acertou!!\n");
        scanner.close();
    }

}
