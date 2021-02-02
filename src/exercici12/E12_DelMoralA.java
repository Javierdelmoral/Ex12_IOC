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
public class E12_DelMoralA {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean dadaCorrecte = true;
        String nomAux, pass;

        String[] persones = new String[0];

        System.out.println("Quantes persones es volen introduir?");
        do {
            if (!sc.hasNextInt()) {
                dadaCorrecte = false;
                System.out.println("Ha de ser un nombre sencer.");

            } else {
                dadaCorrecte = true;
                persones = new String[sc.nextInt()];
            }

            sc.nextLine();
        } while (!dadaCorrecte);

        for (int i = 0; i < persones.length; i++) {

            System.out.println("\nEntra el nom de l'usuari numero " + (i + 1) + ": ");
            persones[i] = sc.next().toLowerCase();

            pass = persones[i].replace("a", "4");
            pass = pass.replace("e", "3");
            pass = pass.replace("i", "1");
            pass = pass.replace("o", "0");
            pass = pass.replace("u", "n");

            System.out.println(persones[i] + " tindra el password: " + pass);
        }

        System.out.println("\nLlista de noms desordenada: ");

        for (int i = 0; i < persones.length; i++) {
            System.out.println("Usuari num " + (i + 1) + " amb nombre: " + persones[i]);
        }
        
        for (int i = 0; i < persones.length - 1; i++) {
            for (int j = i + 1; j < persones.length; j++) {
                if (persones[i].compareTo(persones[j]) > 0) {
                    nomAux = persones[i];
                    persones[i] = persones[j];
                    persones[j] = nomAux;
                }
            }
        }

        System.out.println("\nLlista de noms ordenada: ");
        for (int i = 0; i < persones.length; i++) {
            System.out.println("Usuari num " + (i + 1) + " amb nombre: " + persones[i]);
        }
    }
}
