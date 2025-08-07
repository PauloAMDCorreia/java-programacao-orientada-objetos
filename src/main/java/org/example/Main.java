package org.example;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        //o programa vai verificar se x é diferente de 0
        while (x != 0) {
            //enquanto x for diferente de zero faça
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
    }
}
