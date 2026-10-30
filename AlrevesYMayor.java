package Arreglos;

import java.util.Scanner;

public class AlrevesYMayor {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i =0; i<5; i++){

            numeros[i] = Input.leerEntero("Ingresa el numero " + (i+1) + ": ");
        }
        for (int i=4; i >=0; i --){
            System.out.println(numeros[i]);
        }
        int mayor = numeros [0];
        for (int i =1; i<5; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("\nEl mayor es: " + mayor);
    }

}
