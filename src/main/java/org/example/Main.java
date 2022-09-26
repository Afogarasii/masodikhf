package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner be = new Scanner(System.in);
            System.out.println("Add meg a nevedet!");
            String nev = be.nextLine();
            System.out.println("Milyen nyelven köszöntsön? Angol, Német vagy Spanyol?");
            String nyelv = be.nextLine();

            if (nyelv.equals("Angol")) {
                System.out.println("Hello," + nev);
            } else if (nyelv.equals("Német")) {
                System.out.println("Guten tag " + nev);
            } else if (nyelv.equals("Spanyol")) {
                System.out.println("Hola " + nev);
            }

        }
    }

