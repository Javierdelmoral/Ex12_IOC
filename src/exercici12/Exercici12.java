/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici12;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int aux = 0;
        int[] persones = new int[0];
        boolean dadaCorrecte = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantes persones es volen introduir?");
        do {
            if (!sc.hasNextInt()) {
                dadaCorrecte = false;
                System.out.println("Ha de ser un nombre sencer.");

            } else {
                dadaCorrecte = true;
                persones = new int[sc.nextInt()];
            }

            sc.nextLine();
        } while (!dadaCorrecte);

        for (int i = 0; i < persones.length; i++) {
            System.out.println("Entra el codi l'usuari num " + (i + 1) + " :");

            do {
                if (!sc.hasNextInt()) {
                    dadaCorrecte = false;
                    System.out.println("Ha de ser un nombre sencer.");

                } else {
                    dadaCorrecte = true;
                    persones[i] = sc.nextInt();
                }

                sc.nextLine();
            } while (!dadaCorrecte);

        }

        System.out.println("\nLlista desordenada: ");

        for (int i = 0; i < persones.length; i++) {

            System.out.println("Usuari num " + (i + 1) + " ha introduit: " + persones[i]);
        }

        System.out.println("\nLlista ordenada: ");

        for (int i = 0; i < persones.length; i++) {
            for (int j = 0; j < persones.length - 1; j++) {
                if (persones[j] > persones[j + 1]) {
                    aux = persones[j];
                    persones[j] = persones[j + 1];
                    persones[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < persones.length; i++) {

            System.out.println("Usuari num " + (i + 1) + " ha introduit: " + persones[i]);
        }
    }
}
