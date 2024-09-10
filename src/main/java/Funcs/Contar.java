package Funcs;

import exception.ParametrosInvalidosException;

public class Contar {

    public void contar (Integer n1, Integer n2) throws ParametrosInvalidosException {

        if (n1 < n2){throw new ParametrosInvalidosException();}

        for(Integer i = 0 ; i < (n1 - n2) ; i++){

            System.out.println("Imprimindo número " + i);

        }


    }

}
