package com.amit;
    import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                int numero;
                int a;
                System.out.print("¿Cuántas notas quieres introducir? : ");
                numero = entrada.nextInt();
                for(int i = 1; i <= numero; i++) {
                    System.out.println( );
                    do {
                        System.out.print("nota" + i + ": ");
                        a = entrada.nextInt();
                    } while (a < 1 || a > 10);
                }

            }
        }