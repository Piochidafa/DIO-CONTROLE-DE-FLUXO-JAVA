package Main;

import Funcs.Contar;
import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Integer n1, n2;
        Contar contar = new Contar();
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro Numero: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo Numero: ");
        n2 = sc.nextInt();


        try {
            contar.contar(n1, n2);

        } catch (ParametrosInvalidosException e) {

            throw new RuntimeException(e);
        }

    }




}
