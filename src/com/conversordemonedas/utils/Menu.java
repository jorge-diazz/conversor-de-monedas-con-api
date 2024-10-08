package com.conversordemonedas.utils;

import java.util.Scanner;

public class Menu {
    Operations operations = new Operations();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        operations.setValues();
        int option;

        do {
            menu();
            option = scanner.nextInt();
            options(option);
        } while (option != 4);
    }

    public void menu() {
        System.out.println("""
                Conversor de Monedas.
                1.- Seleccionar moneda.
                2.- Seleccionar moneda para conversión.
                3.- Realizar conversión.
                4.- Salir.
                """);
        operations.showConversion();
        System.out.println();
        System.out.print("Ingresa una opción: ");
    }

    public void options(int option) {
        switch (option) {
            case 1:
                caseOne();
                break;
            case 2:
                caseTwo();
                break;
            case 3:
                caseThree();
                break;
            case 4:
                caseFour();
                break;
            default:
                caseDefault();
        }
    }

    public void caseOne() {
        int currency = currencies();
        operations.setBase(currency);
        operations.conversion();
    }

    public void caseTwo() {
        int currency = currencies();
        operations.setTarget(currency);
        operations.conversion();
    }

    public void caseThree() {
        System.out.println();
        System.out.print("Ingrese la cantidad: ");
        operations.setAmount(scanner.nextDouble());
        operations.conversion();
    }

    public void caseFour() {
        System.out.println();
        System.out.println("Termino el programa.");
    }

    public void caseDefault() {
        System.out.println();
        System.out.println("No se seleccionó ninguna opción.");
    }

    public int currencies() {
        int currency;
        do {
            System.out.println();
            System.out.println("Monedas.");
            operations.getCurrencies();
            System.out.println();
            System.out.print("Ingrese el número de la moneda: ");
            currency = scanner.nextInt() - 1;
            System.out.println();
        } while (currency > operations.sizeCurrencies());

        return currency;
    }
}
