package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.13.​ Parašykite programą kuri paprašytų vartotojo įvesti skaičių kvadrato skaičiavimui.
        // Skaičiavimams sukurkite naują klasę. Skaičiavimas turi būti atliekas kitame metode ir
        // grąžintu rezultatą. Jį spausdinti ekrane. Naudokite formulę rezultatas = a^2 bei MATH
        // BIBLIOTEKA return Math.pow(a, 2);
        // 1.14​. Papildykite 1.13​. Programą nauju metodu kuris apskaičiuotu stačiakampio plotą.
        // Rezultatą spausdinti ekrane. Formulė rezultatas =a*b​.
        // 1.15.​ Papildykite 1.13.​ Programą kuri apskaičiuotu stačiojo trikampio plotą. Vartotojo turi
        // būti paprašyta įvesti abi kraštines. Plotas skaičiuojamas kitame metode ir grąžinamas į
        // main metodą. Rezultatą spausdinti ekrane. Formulė rezultatas = (a*b)/2​;
        // 1.16.​ Papildykite 1.13.​ Programą metodu kuris apskaičiuotu apskritimo plotą. Sukurkite
        // naują metodą kuris grąžins rezultatą. Vartotojo turi būti paprašyta įvesti apskritimo
        // spindulį. Formulė rezultatas = pi*(a^2). Pi = 3.1415
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        double sk1 = sc.nextDouble();
        System.out.println("Skaiciaus kvadratas= " + Skaiciavimas.kvadratas(sk1));

        System.out.println("Iveskite du skaicius plotui skaiciuoti: ");
        double sk2 = sc.nextDouble();
        double sk3 = sc.nextDouble();
        System.out.println("Staciakampio plotas = " + Skaiciavimas.plotas(sk2, sk3));

        System.out.println("Iveskite trikampio krastines: ");
        double sk4 = sc.nextDouble();
        double sk5 = sc.nextDouble();
        System.out.println("Trikampio plotas = " + Skaiciavimas.trikampis(sk4, sk5));

        System.out.println("Iveskite apskritimo spinduli: ");
        double sk6 = sc.nextDouble();
        System.out.println("Apskritimo plotas= " + Skaiciavimas.apskritimas(sk6));
    }
}
